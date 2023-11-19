package com.hospital.managment.payment;

import com.hospital.base.model.entity.BaseEntity;
import com.hospital.managment.receptionist.ReceptionistEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "payment")
public class PaymentEntity extends BaseEntity
{
    @ManyToOne
    @JoinColumn(name = "receptionistId")
    private ReceptionistEntity receptionist;


}
