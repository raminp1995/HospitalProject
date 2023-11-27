package com.hospital.managment.administrativeStaff;

import com.hospital.managment.person.PersonDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class AdminStaffReqDto extends PersonDto
{
    private String post;
}
