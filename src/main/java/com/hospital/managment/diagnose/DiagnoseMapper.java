package com.hospital.managment.diagnose;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class DiagnoseMapper implements IBaseMapper<DiagnoseEntity, DiagnoseReqDto, DiagnoseResDto>
{
    @Override
    public DiagnoseEntity dtoToEntity(DiagnoseReqDto dto)
    {
        DiagnoseEntity diagnose = new DiagnoseEntity();
        BeanUtils.copyProperties(dto, diagnose);
        return diagnose;
    }

    @Override
    public DiagnoseResDto entityToDto(DiagnoseEntity entity)
    {
        DiagnoseResDto diagnoseDto = new DiagnoseResDto();
        BeanUtils.copyProperties(entity, diagnoseDto);
        return diagnoseDto;
    }
}
