package com.hospital.managment.diagnose;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class DiagnoseMapper implements IBaseMapper<DiagnoseEntity, DiagnoseDto>
{
    @Override
    public DiagnoseEntity dtoToEntity(DiagnoseDto dto)
    {
        DiagnoseEntity diagnose = new DiagnoseEntity();
        BeanUtils.copyProperties(dto, diagnose);
        return diagnose;
    }

    @Override
    public DiagnoseDto entityToDto(DiagnoseEntity entity)
    {
        DiagnoseDto diagnoseDto = new DiagnoseDto();
        BeanUtils.copyProperties(entity, diagnoseDto);
        return diagnoseDto;
    }
}
