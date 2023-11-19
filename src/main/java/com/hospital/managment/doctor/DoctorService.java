package com.hospital.managment.doctor;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.timeSlot.ITimeSlotRepository;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<DoctorEntity, DoctorReqDto, DoctorResDto> implements IDoctorService
{
    private final DoctorRepository doctorRepository;
    private final IDoctorMapper doctorMapper;
    private final ITimeSlotRepository timeSlotRepository;
    public DoctorService(IBaseRepository<DoctorEntity> baseRepository, IBaseMapper<DoctorEntity, DoctorReqDto, DoctorResDto> baseMapper, DoctorRepository doctorRepository, IDoctorMapper doctorMapper, ITimeSlotRepository timeSlotRepository)
    {
        super(baseRepository, baseMapper);
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
        this.timeSlotRepository = timeSlotRepository;
    }

    @Override
    public DoctorResDto docInfo(String firstName, String lastName) throws Exception
    {
        DoctorEntity doctor = doctorRepository.findByFirstNameAndLastName(firstName, lastName);
        return doctorMapper.entityToDto(doctor);
    }

    public void saveTimeSlot (TimeSlotEntity entity)
    {
        timeSlotRepository.save(entity);
    }
}
