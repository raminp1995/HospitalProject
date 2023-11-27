package com.hospital.managment.patient;

import com.hospital.base.exception.DayException;
import com.hospital.base.exception.DeletedException;
import com.hospital.base.exception.HourException;
import com.hospital.base.exception.ReservedException;
import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.doctor.*;
import com.hospital.managment.timeSlot.TimeSlotEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class PatientService extends BaseService<PatientEntity, PatientReqDto, PatientResDto> implements IPatientService
{
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final IPatientAppointmentRepository patientAppointmentRepository;
    private final IDoctorAppointmentRepository doctorAppointmentRepository;

    public PatientService(IBaseRepository<PatientEntity> baseRepository, IBaseMapper<PatientEntity, PatientReqDto, PatientResDto> baseMapper, DoctorRepository doctorRepository, PatientRepository patientRepository, IPatientAppointmentRepository patientAppointmentRepository, IDoctorAppointmentRepository doctorAppointmentRepository)
    {
        super(baseRepository, baseMapper);
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.patientAppointmentRepository = patientAppointmentRepository;
        this.doctorAppointmentRepository = doctorAppointmentRepository;
    }

    public Boolean makeAppointment(Long patientId, String drFName, String drLName, String day, String hour) throws Exception
    {
        DoctorEntity doctorEntity = doctorRepository.findByFirstNameAndLastName(drFName, drLName);
        PatientEntity patientEntity = patientRepository.findById(patientId).orElseThrow(null);
        List<PatientAppointment> patientAppointment = patientEntity.getPatientAppointments();

        if (doctorEntity != null)
        {
            //Getting doctor Time Slot
            TimeSlotEntity timeSlot = doctorEntity.getTimeSlot();


            for (int i = 0; i < timeSlot.getDays().size(); i++)
            {
                //Checking Day of Doctor's TimeSlot
                if (timeSlot.getDays().get(i).equalsIgnoreCase(day))
                {
                    //Checking Hour of Doctor's TimeSlot
                    for (int j = 0; j < timeSlot.getHours().size(); j++)
                    {
                        if (timeSlot.getHours().containsKey(hour) && timeSlot.getHours().containsValue(false))
                        {
                            //Adding New Appointment To Doctor Appointment Schedule
                            DoctorAppointment doctorAppointment = new DoctorAppointment();
                            doctorAppointment.setPatientId(patientEntity.getId());
                            doctorAppointment.setPatientName(patientEntity.getFirstName() + " " + patientEntity.getLastName());
                            doctorAppointment.setDay(day);
                            doctorAppointment.setHour(hour);

                            //Setting Doctor's Time Slot to Reserved
                            TimeSlotEntity timeSlot1 = new TimeSlotEntity();
                            timeSlot1.setDays(List.of(day));
                            timeSlot.getHours().put(hour, true);

                            doctorEntity.setTimeSlot(timeSlot);
                            doctorEntity.getAppointmentSchedules().add(doctorAppointment);

                            //Adding Appointment For Patient
                            PatientAppointment patientAppointment1 = new PatientAppointment();
                            patientAppointment1.setDoctorId(doctorEntity.getId());
                            patientAppointment1.setDrName(drFName + " " + drLName);
                            patientAppointment1.setDay(day);
                            patientAppointment1.setHour(hour);


                            //Checking that Is Patient Reserved Appointment or Not
                            if (!patientAppointment.isEmpty())
                            {
                                for (PatientAppointment pa : patientAppointment)
                                {
                                    if (!Objects.equals(pa.getDoctorId(), doctorEntity.getId()))
                                    {
                                        patientEntity.getPatientAppointments().add(patientAppointment1);
                                        doctorAppointmentRepository.save(doctorAppointment);
                                        patientAppointmentRepository.save(patientAppointment1);
                                        doctorRepository.save(doctorEntity);
                                        patientRepository.save(patientEntity);
                                    }
                                    else
                                    {
                                        throw new ReservedException();
                                    }
                                }
                            }
                            else
                            {
                                //This Part Runs When Patient did not have any Appointment
                                patientEntity.getPatientAppointments().add(patientAppointment1);
                                doctorAppointmentRepository.save(doctorAppointment);
                                patientAppointmentRepository.save(patientAppointment1);
                                patientRepository.save(patientEntity);
                                doctorRepository.save(doctorEntity);

                            }

                            return true;
                        }
                        else
                        {
                            throw new HourException();
                        }
                    }
                }
                else
                {
                    throw new DayException();
                }
            }
        }

        return false;
    }

    @Override
    public void cancelAppointment(Long patientId, Long appointmentId) throws DeletedException
    {

        PatientEntity patientEntity = patientRepository.findById(patientId).orElseThrow(null);
        PatientAppointment pa = patientAppointmentRepository.findById(appointmentId).orElse(null);

        assert pa != null;
        Long drId = pa.getDoctorId();

        DoctorEntity doctorEntity = doctorRepository.findById(drId).orElse(null);
        assert doctorEntity != null;

        //Sets Free Doctor's TimeSlot
        TimeSlotEntity timeSlot = doctorEntity.getTimeSlot();
        for (int i=0; i< timeSlot.getDays().size(); i++)
        {
            if (timeSlot.getDays().get(i).equalsIgnoreCase(pa.getDay()))
            {
                timeSlot.getHours().put(pa.getHour(), false);
            }
        }

        //Finds Doctor Appointment ID
        Long drAppointmentId = doctorEntity.getAppointmentSchedules().stream().filter(i -> pa.getDoctorId().equals(drId)).toList().get(0).getId();

        //Removes Canceled Appointment From Doctor Appointment Schedule
        doctorEntity.getAppointmentSchedules()
                .removeIf(i -> i.getPatientId().equals(patientEntity.getId()));

        //Remove Patient Appointment
        patientEntity.getPatientAppointments().removeIf(i -> i.getId().equals(pa.getId()));

        patientRepository.save(patientEntity);
        doctorAppointmentRepository.deleteById(drAppointmentId);
        doctorRepository.save(doctorEntity);
        patientAppointmentRepository.deleteById(pa.getId());
    }


    @Override
    public List<PatientAppointment> viewPatientAppointment(Long patientId)
    {
        return Objects.requireNonNull(patientRepository.findById(patientId).orElse(null)).getPatientAppointments().stream().toList();
    }
}
