package com.hospital.base.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
public interface IBaseMapper<E, ReqDto, ResDto>
{
    E dtoToEntity (ReqDto dto);
    ResDto entityToDto (E entity);
}
