package com.hospital.base.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface IBaseMapper<E, D>
{
    E dtoToEntity (D dto);
    D entityToDto (E entity);
}
