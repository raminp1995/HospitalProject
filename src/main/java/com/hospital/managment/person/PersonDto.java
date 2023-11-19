package com.hospital.managment.person;

import com.hospital.base.model.dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class PersonDto extends BaseDto
{
    private String firstName;
    private String lastName;
    private String nCode;
//    private String gender;
//    private LocalDate birthDate;
//    private String address;
    private String phone;
    private String eMail;

}
