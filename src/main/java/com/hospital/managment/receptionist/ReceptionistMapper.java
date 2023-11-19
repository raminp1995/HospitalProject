package com.hospital.managment.receptionist;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ReceptionistMapper implements IBaseMapper<ReceptionistEntity, ReceptionistReqDto, ReceptionistResDto>
{
    @Override
    public ReceptionistEntity dtoToEntity(ReceptionistReqDto dto)
    {
        ReceptionistEntity receptionist = new ReceptionistEntity();
        BeanUtils.copyProperties(dto, receptionist);
        return receptionist;
    }

    @Override
    public ReceptionistResDto entityToDto(ReceptionistEntity entity)
    {
        ReceptionistResDto receptionistDto = new ReceptionistResDto();
        BeanUtils.copyProperties(entity, receptionistDto);
        return receptionistDto;
    }
}
