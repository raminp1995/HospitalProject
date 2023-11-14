package com.hospital.managment.doctor;

import com.hospital.base.service.IBaseService;

public interface IDoctorService extends IBaseService<DoctorDto>
{
    DoctorDto docInfo (String firstName, String lastName) throws Exception;
}
