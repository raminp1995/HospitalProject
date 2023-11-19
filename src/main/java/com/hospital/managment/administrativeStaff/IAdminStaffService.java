package com.hospital.managment.administrativeStaff;

import com.hospital.base.service.IBaseService;
import com.hospital.managment.doctor.DoctorReqDto;
import com.hospital.managment.doctor.DoctorResDto;

public interface IAdminStaffService extends IBaseService<AdminStaffReqDto, AdminStaffResDto>
{
    DoctorResDto doctorInformation(String firstName, String lastName) throws Exception;
}
