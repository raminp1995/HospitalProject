package com.hospital.managment.administrativeStaff;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.doctor.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminStaffService extends BaseService<AdministrativeStaffEntity, AdminStaffReqDto, AdminStaffResDto> implements IAdminStaffService
{
    //private final DoctorRepository doctorRepository;
    private final DoctorService doctorService;

    public AdminStaffService(IBaseRepository<AdministrativeStaffEntity> baseRepository, IBaseMapper<AdministrativeStaffEntity, AdminStaffReqDto, AdminStaffResDto> baseMapper, DoctorRepository doctorRepository, DoctorService doctorService, IDoctorMapper doctorMapper)
    {
        super(baseRepository, baseMapper);
        this.doctorService = doctorService;
    }

    @Override
    public ResponseEntity<DoctorResDto> doctorInformation(String firstName, String lastName) throws Exception
    {
        return doctorService.docInfo(firstName, lastName);
    }

}
