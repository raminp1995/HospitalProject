package com.hospital.managment.patient;

import com.hospital.base.exception.DayException;
import com.hospital.base.exception.HourException;
import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.doctor.*;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class PatientService extends BaseService<PatientEntity, PatientReqDto, PatientResDto>
{
    private final DoctorRepository doctorRepository;
    public PatientService(IBaseRepository<PatientEntity> baseRepository, IBaseMapper<PatientEntity, PatientReqDto, PatientResDto> baseMapper, DoctorRepository doctorRepository)
    {
        super(baseRepository, baseMapper);
        this.doctorRepository = doctorRepository;
    }

    public Boolean makeAppointment(Long patientId, String drFName, String drLName, String day, String hour) throws Exception
    {
        DoctorEntity doctorEntity = doctorRepository.findByFirstNameAndLastName(drFName, drLName);
        PatientResDto patientResDto = super.getById(patientId);

        if (doctorEntity != null)
        {
            TimeSlotEntity timeSlot = doctorEntity.getTimeSlot();

            for (int i=0; i < timeSlot.getDays().size(); i++)
            {
                if (timeSlot.getDays().get(i).equalsIgnoreCase(day))
                {
                    for (int j=0; j<timeSlot.getHours().size(); j++)
                    {
                        if (timeSlot.getHours().containsKey(hour) && timeSlot.getHours().containsValue(false))
                        {
                            Appointment appointment = new Appointment();
                            appointment.setPatientName(patientResDto.getFirstName() + " " + patientResDto.getLastName());
                            appointment.setDay(day);
                            appointment.setHour(hour);
                            TimeSlotEntity timeSlot1 = new TimeSlotEntity();
                            timeSlot1.setDays(List.of(day));
                            timeSlot.getHours().put(hour, true);
                            doctorEntity.setTimeSlot(timeSlot);
                            doctorEntity.getAppointmentSchedules().add(appointment);
                            doctorRepository.save(doctorEntity);
                            return true;
                        }
                        else
                        {
                            throw new HourException();
                        }
                    }

                }
            }

        }
        else
        {
            throw new DayException();
        }


        return false;
    }
}
