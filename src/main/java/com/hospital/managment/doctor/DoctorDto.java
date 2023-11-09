package com.hospital.managment.doctor;

import com.hospital.base.model.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
//@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorDto extends BaseDto
{
    private String address;
    private String phone;
    private String speciality;
    private String qualifications;
    private String nCode;
}
