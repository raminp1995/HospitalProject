package com.hospital.managment.doctor;

import com.hospital.base.repository.IBaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends IBaseRepository<DoctorEntity>
{
    DoctorEntity findByFirstNameAndLastName(String firstName, String lastName) throws Exception;

    Optional<DoctorEntity> findByEmail (String email);
}
