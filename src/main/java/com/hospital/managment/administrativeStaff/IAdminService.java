package com.hospital.managment.administrativeStaff;

import com.hospital.base.service.IBaseService;
import org.springframework.stereotype.Component;

@Component
public interface IAdminService extends IBaseService<AdminStaffDto>
{
    String doctorInformation(String name) throws Exception;
}
