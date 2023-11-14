package com.hospital.managment.bill;

import com.hospital.base.model.dto.BaseDto;
import com.hospital.managment.patient.PatientDto;
import com.hospital.managment.patient.PatientEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillDto extends BaseDto
{
    private PatientDto patient;

    private Integer billNumber;

    private Double roomCost;

    private Double labCost;

    private Double medCost;

    private Double allCost;
}
