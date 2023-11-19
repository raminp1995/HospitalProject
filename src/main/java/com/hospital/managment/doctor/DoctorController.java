package com.hospital.managment.doctor;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import com.hospital.managment.timeSlot.ITimeSlotRepository;
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
    public List<DoctorResDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public DoctorResDto save(@RequestBody DoctorReqDto doctor)
    {
        doctorService.saveTimeSlot(doctor.getTimeSlot());
        return super.save(doctor);
    }

    @GetMapping("/getById/{id}")
    public DoctorResDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("doctorInfo/{firstName}&{lastName}")

    public DoctorResDto getByName(@PathVariable String firstName, @PathVariable String lastName) throws Exception
    {
        return doctorService.docInfo(firstName, lastName);
    }

    @PutMapping("/update")
    @Override
    public DoctorResDto update (@RequestBody DoctorReqDto doctor) throws DeletedException
    {
        return super.update(doctor);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }
}
