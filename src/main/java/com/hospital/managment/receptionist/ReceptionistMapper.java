package com.hospital.managment.receptionist;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ReceptionistMapper implements IBaseMapper<ReceptionistEntity, ReceptionistDto>
{
    @Override
    public ReceptionistEntity dtoToEntity(ReceptionistDto dto)
    {
        ReceptionistEntity receptionist = new ReceptionistEntity();
        BeanUtils.copyProperties(dto, receptionist);
        return receptionist;
    }

    @Override
    public ReceptionistDto entityToDto(ReceptionistEntity entity)
    {
        ReceptionistDto receptionistDto = new ReceptionistDto();
        BeanUtils.copyProperties(entity, receptionistDto);
        return receptionistDto;
    }
}
