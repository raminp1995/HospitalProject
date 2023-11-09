package com.hospital.managment.administrativeStaff;

import com.hospital.base.model.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class AdminStaffDto extends BaseDto
{
    private String name;
    private String post;
}
