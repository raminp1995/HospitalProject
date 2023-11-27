package com.hospital.managment.patient;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.service.IBaseService;

import java.util.List;

public interface IPatientService extends IBaseService<PatientReqDto, PatientResDto>
{
    Boolean makeAppointment(Long patientId, String drFName, String drLName, String day, String hour) throws Exception;
    void cancelAppointment(Long patientId, Long appointmentId) throws DeletedException;

    List<PatientAppointment> viewPatientAppointment(Long patientId);
}
