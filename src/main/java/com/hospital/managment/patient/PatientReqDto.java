package com.hospital.managment.patient;

import com.hospital.managment.bill.BillReqDto;
import com.hospital.managment.bill.BillResDto;
import com.hospital.managment.doctor.DoctorReqDto;
import com.hospital.managment.doctor.DoctorResDto;
import com.hospital.managment.person.PersonDto;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientReqDto extends PersonDto
{
    private BillReqDto bill;
    private String bloodGroup;
    private List<DoctorReqDto> doctors;
}
