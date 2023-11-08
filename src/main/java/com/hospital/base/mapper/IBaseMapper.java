package com.hospital.base.mapper;

public interface IBaseMapper<E, D>
{
    E dtoToEntity (D dto);
    D entityToDto (E entity);
}
