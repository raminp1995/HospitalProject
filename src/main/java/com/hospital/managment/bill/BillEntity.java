package com.hospital.managment.bill;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hospital.base.model.entity.BaseEntity;
import com.hospital.managment.patient.PatientEntity;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "bill")
public class BillEntity extends BaseEntity
{

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientId")
    private PatientEntity patient;

    private Integer billNumber;

    private Double roomCost;

    private Double labCost;

    private Double medCost;

    private Double allCost;

}
