package com.hospital.managment.doctor;

import com.hospital.base.model.dto.BaseDto;
import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.patient.PatientEntity;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorResDto extends BaseDto
{
    private String speciality;
    private String qualifications;
    private List<PatientEntity> patients;
    private DiagnoseEntity diagnose;
    private TimeSlotEntity timeSlot;
    private List<Appointment> appointmentSchedule;
}
