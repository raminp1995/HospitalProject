package com.hospital.managment.patient;

import com.hospital.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface IPatientMapper extends IBaseMapper<PatientEntity, PatientReqDto, PatientResDto>
{
}
