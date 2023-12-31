package com.hospital.base.service;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.model.dto.BaseDto;
import com.hospital.base.model.entity.BaseEntity;
import com.hospital.base.repository.IBaseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;


public class BaseService<E extends BaseEntity, ReqDto extends BaseDto, ResDto extends BaseDto> implements IBaseService<ReqDto, ResDto>
{
    private final IBaseRepository<E> baseRepository;
    private final IBaseMapper<E, ReqDto, ResDto> baseMapper;

    public BaseService(IBaseRepository<E> baseRepository, IBaseMapper<E, ReqDto, ResDto> baseMapper)
    {
        this.baseRepository = baseRepository;
        this.baseMapper = baseMapper;
    }


    @Override
    public ResponseEntity<List<ResDto>> getAll()
    {
        return new ResponseEntity<>(baseRepository.findAll().stream().filter(i -> !i.getDeleted()).map(baseMapper::entityToDto).toList(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResDto> save(ReqDto dto)
    {
        return new ResponseEntity<>(baseMapper.entityToDto(baseRepository.save(baseMapper.dtoToEntity(dto))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResDto> update(ReqDto dto) throws DeletedException
    {
        E entity = baseRepository.findById(dto.getId()).orElse(null);

        if (entity != null)
        {
            if (!entity.getDeleted())
            {
                copyNonNullProperties(dto, entity);
                return new ResponseEntity<>(baseMapper.entityToDto(baseRepository.save(entity)), HttpStatus.OK);
            }
            else
            {
                throw new DeletedException();
            }
        }
        else
        {
            throw new NoSuchElementException();
        }
    }

    @Override
    public ResponseEntity<ResDto> getById(Long id) throws DeletedException
    {

        if (baseRepository.findById(id).isPresent())
        {
            if (!baseRepository.findById(id).get().getDeleted())
            {
                return new ResponseEntity<>(baseMapper.entityToDto(baseRepository.findById(id).get()), HttpStatus.OK);
            }
            else
            {
                throw new DeletedException();
            }
        }
        else
        {
            throw new NoSuchElementException();
        }
    }

    @Override
    public ResponseEntity<ResDto> getByName(String name) throws Exception
    {
        E entity = baseRepository.findByFirstName(name);

        if (entity != null)
        {
            if (!entity.getDeleted())
            {
                return new ResponseEntity<>(baseMapper.entityToDto(entity), HttpStatus.OK);
            }
            else
            {
                throw new DeletedException();
            }
        }
        else
        {
            throw new NoSuchElementException();
        }
    }


    public void delete (Long id) throws Exception
    {
        E entity = baseRepository.findById(id).orElse(null);
        if (entity != null)
        {
            if (!entity.getDeleted())
            {
                entity.setDeleted(true);
                baseRepository.save(entity);
            }
            else
            {
                throw new NoSuchElementException();
            }
        }
    }


    public static void copyNonNullProperties(Object source, Object target)
    {
        BeanUtils.copyProperties(source, target, getNullPropertyName(source));
    }

    public static String[] getNullPropertyName(Object source)
    {
        final BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (PropertyDescriptor pd : pds)
        {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null)
            {
                emptyNames.add(pd.getName());
            }
        }

        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
