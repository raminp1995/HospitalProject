package com.hospital.managment.staff;

import com.hospital.managment.person.PersonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.ArrayList;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class StaffEntity extends PersonEntity
{
    protected ArrayList<String> certificates;

    protected ArrayList<String> educations;
}
