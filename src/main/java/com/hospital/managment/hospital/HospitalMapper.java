package com.hospital.managment.hospital;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class HospitalMapper implements IBaseMapper<HospitalEntity, HospitalDto>
{
    @Override
    public HospitalEntity dtoToEntity (HospitalDto hospitalDto)
    {
        HospitalEntity hospitalEntity = new HospitalEntity();
        BeanUtils.copyProperties(hospitalDto, hospitalEntity);
        return hospitalEntity;
    }

    @Override
    public HospitalDto entityToDto (HospitalEntity hospital)
    {
        HospitalDto hospitalDto = new HospitalDto();
        BeanUtils.copyProperties(hospital, hospitalDto);
        return hospitalDto;
    }
}
