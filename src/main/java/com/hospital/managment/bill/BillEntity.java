package com.hospital.managment.bill;

import com.hospital.base.model.entity.BaseEntity;
import com.hospital.managment.patient.PatientEntity;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bill")
public class BillEntity extends BaseEntity
{

    @OneToOne
    @JoinColumn(name = "patientId")
    private PatientEntity patient;

    private Integer billNumber;

    private Double roomCost;

    private Double labCost;

    private Double medCost;

    @Transient
    private Double allCost;
}
