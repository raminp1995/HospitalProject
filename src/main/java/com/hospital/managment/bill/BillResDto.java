package com.hospital.managment.bill;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hospital.base.model.dto.BaseDto;
import com.hospital.managment.patient.PatientResDto;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Getter
@Setter
public class BillResDto extends BaseDto
{
//    private PatientResDto patient ;

    private Integer billNumber;

    private Double roomCost;

    private Double labCost;

    private Double medCost;

    private Double allCost;

}
