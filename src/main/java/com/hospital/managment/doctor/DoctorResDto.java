package com.hospital.managment.doctor;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hospital.base.model.dto.BaseDto;
import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.patient.PatientEntity;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorResDto extends BaseDto
{
    private String speciality;
    private String qualifications;
    @JsonBackReference                  // Using This For Prevent Recursion of Patient and Doctor (Stack OverFlow)
    private List<PatientEntity> patients;
    private DiagnoseEntity diagnose;
    private TimeSlotEntity timeSlot;
    private List<DoctorAppointment> appointmentSchedule;
    private String email;
    private String password;
    private String role;
}
