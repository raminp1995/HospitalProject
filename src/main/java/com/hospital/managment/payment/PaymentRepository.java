package com.hospital.managment.payment;

import com.hospital.base.repository.IBaseRepository;
import org.springframework.data.annotation.Transient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends IBaseRepository<PaymentEntity>
{
    @Override
    @Transient
    default PaymentEntity findByFirstName(String name) throws Exception
    {
        return null;
    }
}
