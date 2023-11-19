package com.hospital.managment.patient;

import com.hospital.managment.bill.BillResDto;
import com.hospital.managment.person.PersonDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Getter
@Setter
public class PatientResDto extends PersonDto
{
    private BillResDto bill;

    private String bloodGroup;
}
