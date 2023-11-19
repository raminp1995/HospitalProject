package com.hospital.managment.patient;

import com.hospital.managment.bill.BillReqDto;
import com.hospital.managment.person.PersonDto;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientReqDto extends PersonDto
{
    private BillReqDto bill;

    private String bloodGroup;
}
