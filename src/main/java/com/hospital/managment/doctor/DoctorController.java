package com.hospital.managment.doctor;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import com.hospital.managment.timeSlot.ITimeSlotRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController extends BaseController<DoctorService, DoctorReqDto, DoctorResDto>
{
    private final DoctorService doctorService;

    public DoctorController(DoctorService service, DoctorService doctorService)
    {
        super(service);
        this.doctorService = doctorService;
    }

    @GetMapping("/getAll")
    @Override
    public ResponseEntity<List<DoctorResDto>> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public ResponseEntity<DoctorResDto> save(@RequestBody DoctorReqDto doctor)
    {
        doctorService.saveTimeSlot(doctor.getTimeSlot());
        return super.save(doctor);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<DoctorResDto> getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("doctorInfo/{firstName}&{lastName}")
    public ResponseEntity<DoctorResDto> getByName(@PathVariable String firstName, @PathVariable String lastName) throws Exception
    {
        return doctorService.docInfo(firstName, lastName);
    }

    @PutMapping("/update")
    @Override
    public ResponseEntity<DoctorResDto> update (@RequestBody DoctorReqDto doctor) throws DeletedException
    {
        return super.update(doctor);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }

    @GetMapping("/viewAppointment/{doctorId}")
    public ResponseEntity<List<DoctorAppointment>> viewAppointment(@PathVariable Long doctorId)
    {
        return doctorService.viewAppointment(doctorId);
    }

    @PutMapping("/doctorPrescribe/{doctorId}")
    public ResponseEntity<Boolean> doctorPrescribe(@PathVariable Long doctorId, @RequestBody Prescription prescription)
    {
        return doctorService.doctorPrescribe(doctorId, prescription);
    }

    @GetMapping("/viewPrescribe/{doctorId}&{patientId}")
    public ResponseEntity<Prescription> viewPrescribe(@PathVariable Long doctorId, @PathVariable Long patientId)
    {
        return doctorService.viewPrescribe(doctorId, patientId);
    }
}
