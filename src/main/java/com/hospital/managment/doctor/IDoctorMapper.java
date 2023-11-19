package com.hospital.managment.doctor;

import com.hospital.base.mapper.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface IDoctorMapper extends IBaseMapper<DoctorEntity, DoctorReqDto, DoctorResDto>
{
}
