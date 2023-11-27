package com.hospital.managment.doctor;

import com.hospital.base.repository.IBaseRepository;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorAppointmentRepository extends IBaseRepository<DoctorAppointment>
{
    @Transient
    @Override
    default DoctorAppointment findByFirstName(String name) throws Exception
    {
        return null;
    }
}
