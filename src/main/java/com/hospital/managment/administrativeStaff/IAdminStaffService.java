package com.hospital.managment.administrativeStaff;

import com.hospital.base.service.IBaseService;
import com.hospital.managment.doctor.DoctorDto;

public interface IAdminStaffService extends IBaseService<AdminStaffDto>
{
    DoctorDto doctorInformation(String firstName, String lastName) throws Exception;
}
