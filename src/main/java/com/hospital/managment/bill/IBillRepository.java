package com.hospital.managment.bill;

import com.hospital.base.repository.IBaseRepository;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Repository;

@Repository
public interface IBillRepository extends IBaseRepository<BillEntity>
{
    @Transient
    @Override
    default BillEntity findByFirstName(String name) throws Exception
    {
        return null;
    }
}
