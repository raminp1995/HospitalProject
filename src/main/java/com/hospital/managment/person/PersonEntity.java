package com.hospital.managment.person;

import com.hospital.base.model.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;


import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersonEntity extends BaseEntity
{
    //@NotEmpty
    @Column
    private String firstName;

    //@NotEmpty
    @Column
    private String lastName;

    @Column
    private Gender gender;

    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;

    @Column
    private String address;

    //@NotBlank
    //@UniqueElements
    private String phone;

    @Email
    private String eMail;

    //@NotNull
    //@NotEmpty
    //@UniqueElements
    private String nCode;
}
