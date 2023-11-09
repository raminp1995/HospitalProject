package com.hospital.managment.patient;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper implements IBaseMapper<PatientEntity, PatientDto>
{
    @Override
    public PatientEntity dtoToEntity(PatientDto dto)
    {
        PatientEntity patient = new PatientEntity();
        BeanUtils.copyProperties(dto, patient);
        return patient;
    }

    @Override
    public PatientDto entityToDto(PatientEntity entity)
    {
        PatientDto patientDto = new PatientDto();
        BeanUtils.copyProperties(entity, patientDto);
        return patientDto;
    }
}
