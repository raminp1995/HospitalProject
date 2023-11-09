package com.hospital.managment.patient;

import com.hospital.base.repository.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends IBaseRepository<PatientEntity>
{
}
