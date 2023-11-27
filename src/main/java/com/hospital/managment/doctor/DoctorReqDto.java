package com.hospital.managment.doctor;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.patient.PatientEntity;
import com.hospital.managment.person.PersonDto;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorReqDto extends PersonDto
{
    private String speciality;
    private String qualifications;
    private List<PatientEntity> patients;
    private DiagnoseEntity diagnose;
    private TimeSlotEntity timeSlot;
    private String email;
    private String password;
    private String role;

}
