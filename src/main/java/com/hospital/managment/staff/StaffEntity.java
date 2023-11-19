package com.hospital.managment.staff;

import com.hospital.managment.person.PersonEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "staff")
@Inheritance(strategy = InheritanceType.JOINED)
public class StaffEntity extends PersonEntity
{

    protected ArrayList<String> certificates;

    protected ArrayList<String> educations;
}
