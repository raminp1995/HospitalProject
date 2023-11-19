package com.hospital.managment.patient;

import com.hospital.base.service.IBaseService;

public interface IPatientService extends IBaseService<PatientReqDto, PatientResDto>
{
    Boolean makeAppointment(Long patientId, String drFName, String drLName, String day, String hour) throws Exception;
}
