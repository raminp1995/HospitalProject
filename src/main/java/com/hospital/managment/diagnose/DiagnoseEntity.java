package com.hospital.managment.diagnose;

import com.hospital.base.model.entity.BaseEntity;
import com.hospital.managment.doctor.DoctorEntity;
import com.hospital.managment.patient.PatientEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiagnoseEntity extends BaseEntity
{
    private String type;

    @OneToOne(mappedBy = "diagnose", fetch = FetchType.EAGER)
    private DoctorEntity doctor;

    @OneToOne
    private PatientEntity patient;

    public String diagnoseDetails()
    {
        return "";
    }


}
