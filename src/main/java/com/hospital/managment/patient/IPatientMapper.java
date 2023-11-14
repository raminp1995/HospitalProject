package com.hospital.managment.patient;

import com.hospital.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface IPatientMapper extends IBaseMapper<PatientEntity, PatientDto>
{
//    @Override
//    public PatientEntity dtoToEntity(PatientDto dto)
//    {
//        PatientEntity patient = new PatientEntity();
//        BeanUtils.copyProperties(dto, patient);
//        return patient;
//    }
//
//    @Override
//    public PatientDto entityToDto(PatientEntity entity)
//    {
//        PatientDto patientDto = new PatientDto();
//        BeanUtils.copyProperties(entity, patientDto);
//        return patientDto;
//    }
}
