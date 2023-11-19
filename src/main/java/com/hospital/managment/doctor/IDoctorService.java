package com.hospital.managment.doctor;

import com.hospital.base.service.IBaseService;
import com.hospital.managment.timeSlot.TimeSlotEntity;

public interface IDoctorService extends IBaseService<DoctorReqDto, DoctorResDto>
{
    DoctorResDto docInfo (String firstName, String lastName) throws Exception;
    void saveTimeSlot (TimeSlotEntity entity);
}
