package com.hospital.managment.doctor;

import com.hospital.base.service.IBaseService;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IDoctorService extends IBaseService<DoctorReqDto, DoctorResDto>
{
    ResponseEntity<DoctorResDto> docInfo (String firstName, String lastName) throws Exception;
    void saveTimeSlot (TimeSlotEntity entity);

    ResponseEntity<List<DoctorAppointment>> viewAppointment (Long doctorId);

    ResponseEntity<Boolean> doctorPrescribe (Long doctorId, Prescription prescription);

    ResponseEntity<Prescription> viewPrescribe(Long doctorId, Long patientId);
}
