package com.hospital.base.controller;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.service.IBaseService;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public abstract class BaseController<S extends IBaseService<D>, D>
{

    private final S service;

    public List<D> getAll()
    {
        return service.getAll();
    }

    public D save(D dto)
    {
        return service.save(dto);
    }

    public D update (D dto) throws DeletedException
    {
        return service.update(dto);
    }

    public D getById (Long id) throws DeletedException
    {
        return service.getById(id);
    }

    public void delete (Long id) throws Exception
    {
        service.delete(id);
    }
}
