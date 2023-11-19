package com.hospital.base.service;

import com.hospital.base.exception.DeletedException;
import com.hospital.managment.doctor.DoctorEntity;

import java.util.List;


public interface IBaseService<ReqDto, ResDto>
{
    List<ResDto> getAll();

    ResDto save(ReqDto dto);

    ResDto update (ReqDto dto)throws DeletedException;

    ResDto getById (Long Id) throws DeletedException;

    ResDto getByName (String name) throws Exception;

    void delete (Long id) throws Exception;

    //D findByFirstName(String name) throws Exception;
}
