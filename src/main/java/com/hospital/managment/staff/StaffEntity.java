package com.hospital.managment.staff;

import com.hospital.managment.person.PersonEntity;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.ArrayList;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StaffEntity extends PersonEntity
{
    protected ArrayList<String> certificates;

    protected ArrayList<String> educations;
}
