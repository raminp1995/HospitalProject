package com.hospital.managment.doctor;

import com.hospital.base.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Prescription extends BaseEntity
{
    private Long patientId;

    private String prescribeMed;

    private String prescribeTest;
}
