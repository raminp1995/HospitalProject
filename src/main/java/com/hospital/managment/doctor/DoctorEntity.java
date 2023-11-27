package com.hospital.managment.doctor;

import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.patient.PatientEntity;
import com.hospital.managment.staff.StaffEntity;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctor")
public class DoctorEntity extends StaffEntity
{

    private String speciality;
    private String qualifications;

    @ManyToMany(mappedBy = "doctors")
    private List<PatientEntity> patients = new ArrayList<>();

    @OneToOne
    private DiagnoseEntity diagnose;

    //@OneToOne
    @OneToOne(targetEntity = TimeSlotEntity.class)
    @JoinColumn(name = "timeSlotId")
    private TimeSlotEntity timeSlot;

    @OneToMany(targetEntity = DoctorAppointment.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "doctorAppointmentId")
    private List<DoctorAppointment> appointmentSchedules = new ArrayList<>();

    @OneToMany(targetEntity = Prescription.class, cascade = CascadeType.ALL)
    private List<Prescription> prescriptions = new ArrayList<>();

    private String password;

    private String role;

    public void prescribeMed()
    {

    }

    public void prescribeTest()
    {

    }

    public void appointmentSchedule ()
    {

    }

    public void timeSlot()
    {

    }
}
