//package com.hospital.managment.doctor;
//
//import com.hospital.base.mapper.IBaseMapper;
//import org.springframework.beans.BeanUtils;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DoctorMapper implements IBaseMapper<DoctorEntity, DoctorReqDto, DoctorResDto>
//{
//    @Override
//    public DoctorEntity dtoToEntity(DoctorReqDto dto)
//    {
//        DoctorEntity doctor = new DoctorEntity();
//        BeanUtils.copyProperties(dto, doctor);
//        return doctor;
//    }
//
//    @Override
//    public DoctorResDto entityToDto(DoctorEntity entity)
//    {
//        DoctorResDto doctorDto = new DoctorResDto();
//        BeanUtils.copyProperties(entity, doctorDto);
//        return doctorDto;
//    }
//}
