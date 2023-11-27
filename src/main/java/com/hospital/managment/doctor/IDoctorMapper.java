package com.hospital.managment.doctor;

import com.hospital.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface IDoctorMapper extends IBaseMapper<DoctorEntity, DoctorReqDto, DoctorResDto>
{
}
