package com.hospital.managment.patient;

//import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.doctor.DoctorDetails;
import com.hospital.managment.doctor.DoctorEntity;
import com.hospital.managment.person.PersonEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Builder
@Entity
public class PatientEntity extends PersonEntity implements DoctorDetails
{
    private String name;
    private Long patientCode;

    @ManyToMany(mappedBy = "patients", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DoctorEntity> doctors = new ArrayList<>();

//    @OneToOne(mappedBy = "patient", fetch = FetchType.EAGER)
//    private DiagnoseEntity diagnose;

    @Override
    public void viewDoctors()
    {

    }

    @Override
    public void viewMedicine()
    {

    }

    @Override
    public void DoctorSchedule()
    {

    }
}
