package com.hospital.managment.patient;

import com.hospital.base.repository.IBaseRepository;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPatientAppointmentRepository extends IBaseRepository<PatientAppointment>
{
    @Transient
    @Override
    default PatientAppointment findByFirstName(String name) throws Exception
    {
        return null;
    }
}
