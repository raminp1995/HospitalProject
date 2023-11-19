package com.hospital.managment.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appointment implements Serializable
{
    private String patientName;
    private String day;
    private String hour;
}
