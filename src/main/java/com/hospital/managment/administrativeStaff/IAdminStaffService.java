package com.hospital.managment.administrativeStaff;

import com.hospital.base.service.IBaseService;
import com.hospital.managment.doctor.DoctorReqDto;
import com.hospital.managment.doctor.DoctorResDto;
import org.springframework.http.ResponseEntity;

public interface IAdminStaffService extends IBaseService<AdminStaffReqDto, AdminStaffResDto>
{
    ResponseEntity<DoctorResDto> doctorInformation(String firstName, String lastName) throws Exception;
}
