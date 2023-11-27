package com.hospital.managment.patient;

import com.hospital.base.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PatientAppointment extends BaseEntity implements Serializable
{
    private Long doctorId;
    private String drName;
    private String day;
    private String hour;
}
