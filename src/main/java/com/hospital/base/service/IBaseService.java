package com.hospital.base.service;

import com.hospital.base.exception.DeletedException;
import com.hospital.managment.doctor.DoctorEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface IBaseService<ReqDto, ResDto>
{
    ResponseEntity<List<ResDto>> getAll();

    ResponseEntity<ResDto> save(ReqDto dto);

    ResponseEntity<ResDto> update (ReqDto dto)throws DeletedException;

    ResponseEntity<ResDto> getById (Long Id) throws DeletedException;

    ResponseEntity<ResDto> getByName (String name) throws Exception;

    void delete (Long id) throws Exception;

    //D findByFirstName(String name) throws Exception;
}
