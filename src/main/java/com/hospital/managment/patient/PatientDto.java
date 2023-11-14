package com.hospital.managment.patient;

import com.hospital.base.model.dto.BaseDto;
import com.hospital.managment.bill.BillDto;
import com.hospital.managment.person.PersonDto;
import jdk.jfr.BooleanFlag;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientDto extends PersonDto
{
    private BillDto bill;
}
