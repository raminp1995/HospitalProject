package com.hospital.managment.doctor;

import com.hospital.base.repository.IBaseRepository;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrescription extends IBaseRepository<Prescription>
{
    @Transient
    @Override
    default Prescription findByFirstName(String name) throws Exception
    {
        return null;
    }
}
