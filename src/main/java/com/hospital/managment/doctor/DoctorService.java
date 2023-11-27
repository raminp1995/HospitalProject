package com.hospital.managment.doctor;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.timeSlot.ITimeSlotRepository;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
    public ResponseEntity<DoctorResDto> docInfo(String firstName, String lastName) throws Exception
    {
        DoctorEntity doctor = doctorRepository.findByFirstNameAndLastName(firstName, lastName);
        return new ResponseEntity<>(doctorMapper.entityToDto(doctor), HttpStatus.OK);
    }

    public void saveTimeSlot (TimeSlotEntity entity)
    {
        timeSlotRepository.save(entity);
    }

    @Override
    public ResponseEntity<List<DoctorAppointment>> viewAppointment(Long doctorId)
    {
        return new ResponseEntity<>(
                Objects.requireNonNull(doctorRepository.findById(doctorId).orElse(null))
                        .getAppointmentSchedules().stream().toList(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Boolean> doctorPrescribe(Long doctorId, Prescription prescription)
    {
        DoctorEntity doctorEntity = doctorRepository.findById(doctorId).orElse(null);
        assert doctorEntity != null;
        doctorEntity.getPrescriptions().add(prescription);
        doctorRepository.save(doctorEntity);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Prescription> viewPrescribe(Long doctorId, Long patientId)
    {
        DoctorEntity doctorEntity = doctorRepository.findById(doctorId).orElse(null);
        assert doctorEntity != null;
        return new ResponseEntity<>(
                doctorEntity.getPrescriptions().stream()
                        .filter(i -> i.getPatientId()
                                .equals(patientId)).toList().get(0), HttpStatus.OK);
    }
}
