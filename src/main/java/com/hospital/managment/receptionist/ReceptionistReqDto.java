package com.hospital.managment.receptionist;

import com.hospital.managment.person.PersonDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
//@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReceptionistReqDto extends PersonDto
{
}
