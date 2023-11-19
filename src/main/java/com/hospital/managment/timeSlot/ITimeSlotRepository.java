package com.hospital.managment.timeSlot;

import com.hospital.base.repository.IBaseRepository;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Repository;

@Repository
public interface ITimeSlotRepository extends IBaseRepository<TimeSlotEntity>
{
    @Transient
    @Override
    default TimeSlotEntity findByFirstName(String name) throws Exception
    {
        return null;
    }
}
