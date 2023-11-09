package com.hospital.managment.administrativeStaff;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
//import com.hospital.managment.doctor.DoctorDto;
//import com.hospital.managment.doctor.DoctorEntity;
//import com.hospital.managment.doctor.DoctorMapper;
//import com.hospital.managment.doctor.DoctorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminStaffService extends BaseService<AdministrativeStaffEntity, AdminStaffDto>
{
//    private DoctorRepository doctorRepository;
//
//    private DoctorMapper doctorMapper;

    public AdminStaffService(IBaseRepository<AdministrativeStaffEntity> baseRepository, IBaseMapper<AdministrativeStaffEntity, AdminStaffDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }

//    @Override
//    public String doctorInformation(String name) throws Exception
//    {
//        String docInfo = "";
//        DoctorEntity doctor = doctorRepository.findByName(name);
//        DoctorDto doctorDto = doctorMapper.entityToDto(doctor);
//        docInfo += doctorDto.getName() + " " + doctorDto.getNCode() + " " + doctorDto.getPhone() + " " + doctorDto.getSpeciality()
//                + " " + doctorDto.getQualifications();
//        return docInfo;
//    }
}
