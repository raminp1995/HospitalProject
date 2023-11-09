package com.hospital.managment.doctor;

//import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.diagnose.DiagnoseEntity;
import com.hospital.managment.patient.PatientEntity;
import com.hospital.managment.staff.StaffEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorEntity extends StaffEntity
{
    private String name;
    private String address;
    private String phone;
    private String speciality;
    private String qualifications;

    @ManyToMany
    private List<PatientEntity> patients = new ArrayList<>();

    @OneToOne
    private DiagnoseEntity diagnose;



    public String displayDoctorInfo()
    {
        return "";
    }

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
