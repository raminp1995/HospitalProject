package com.hospital.base.controller;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.service.IBaseService;
import lombok.AllArgsConstructor;
import java.util.List;


public abstract class BaseController<S extends IBaseService<ReqDto, ResDto>, ReqDto, ResDto>
{

    private final S service;
    public BaseController(S service)
    {
        this.service = service;
    }

    public List<ResDto> getAll()
    {
        return service.getAll();
    }

    public ResDto save(ReqDto dto)
    {
        return service.save(dto);
    }

    public ResDto update (ReqDto dto) throws DeletedException
    {
        return service.update(dto);
    }

    public ResDto getById (Long id) throws DeletedException
    {
        return service.getById(id);
    }

    public ResDto getByName(String name) throws Exception
    {
        return service.getByName(name);
    }

    public void delete (Long id) throws Exception
    {
        service.delete(id);
    }

}
