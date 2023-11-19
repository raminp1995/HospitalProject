package com.hospital.managment.doctor;

import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.patient.PatientEntity;
import com.hospital.managment.staff.StaffEntity;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
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

    @ElementCollection
    private List<Appointment> appointmentSchedules = new ArrayList<>();

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
