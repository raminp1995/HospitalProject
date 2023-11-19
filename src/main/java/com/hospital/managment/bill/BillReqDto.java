package com.hospital.managment.bill;

import com.hospital.base.model.dto.BaseDto;
import com.hospital.managment.patient.PatientReqDto;
import lombok.*;
import org.mapstruct.Mapping;
import org.mapstruct.ap.internal.processor.MapperServiceProcessor;
import org.mapstruct.factory.Mappers;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BillReqDto extends BaseDto
{
    private PatientReqDto patient;

    private Integer billNumber;

    private Double roomCost;

    private Double labCost;

    private Double medCost;
}
