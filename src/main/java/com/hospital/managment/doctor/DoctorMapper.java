package com.hospital.managment.doctor;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper implements IBaseMapper<DoctorEntity, DoctorDto>
{
    @Override
    public DoctorEntity dtoToEntity(DoctorDto dto)
    {
        DoctorEntity doctor = new DoctorEntity();
        BeanUtils.copyProperties(dto, doctor);
        return doctor;
    }

    @Override
    public DoctorDto entityToDto(DoctorEntity entity)
    {
        DoctorDto doctorDto = new DoctorDto();
        BeanUtils.copyProperties(entity, doctorDto);
        return doctorDto;
    }
}
