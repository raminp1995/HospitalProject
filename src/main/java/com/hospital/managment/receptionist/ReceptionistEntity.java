package com.hospital.managment.receptionist;

import com.hospital.managment.administrativeStaff.AdministrativeStaffEntity;
import com.hospital.managment.payment.PaymentEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReceptionistEntity extends AdministrativeStaffEntity
{
    @OneToMany(mappedBy = "receptionist")
    private List<PaymentEntity> payment = new ArrayList<>();
}
