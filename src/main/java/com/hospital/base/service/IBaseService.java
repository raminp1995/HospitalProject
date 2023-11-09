package com.hospital.base.service;

import com.hospital.base.exception.DeletedException;

import java.util.List;


public interface IBaseService<D>
{
    List<D> getAll();

    D save(D dto);

    D update (D dto)throws DeletedException;

    D getById (Long Id) throws DeletedException;

    D getByName (String name) throws Exception;

    void delete (Long id) throws Exception;
}
