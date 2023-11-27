package com.hospital.managment.patient;

import com.hospital.managment.bill.BillResDto;
import com.hospital.managment.doctor.DoctorResDto;
import com.hospital.managment.person.PersonDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Getter
@Setter
public class PatientResDto extends PersonDto
{
    private BillResDto bill;
    private String bloodGroup;
    private List<DoctorResDto> doctors;
    private List<PatientAppointment> patientAppointments;
}
