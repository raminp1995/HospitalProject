package com.hospital.managment.patient;

//import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.bill.BillEntity;
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
@Getter
@Setter
@Entity
@Builder
@Table(name = "patient")
public class PatientEntity extends PersonEntity
{

    //private Long patientCode;

//    @Enumerated(EnumType.STRING)
//    private Enum<InsuranceType> insurance;

    @OneToOne(mappedBy = "patient")
    private BillEntity bill;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "doctor_patient",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private List<DoctorEntity> doctors = new ArrayList<>();

//    @OneToOne(mappedBy = "patient", fetch = FetchType.EAGER)
//    private DiagnoseEntity diagnose;

    private String bloodGroup;

    @OneToMany(targetEntity = PatientAppointment.class, cascade = CascadeType.ALL)
    //@JoinColumn(name = "patinetAppointmentId")
    private List<PatientAppointment> patientAppointments = new ArrayList<>();

}
