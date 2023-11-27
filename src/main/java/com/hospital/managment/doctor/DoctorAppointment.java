package com.hospital.managment.doctor;

import com.hospital.base.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorAppointment extends BaseEntity implements Serializable
{
    private Long patientId;
    private String patientName;
    private String day;
    private String hour;
}
