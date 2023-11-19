package com.hospital.managment.patient;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController extends BaseController<PatientService, PatientReqDto, PatientResDto> implements IPatientService
{
    private final PatientService patientService;
    private HttpServletRequest httpServletRequest;
    public PatientController(PatientService service, PatientService patientService)
    {
        super(service);
        this.patientService = patientService;
    }

    @GetMapping("/getAll")
    @Override
    public List<PatientResDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public PatientResDto save(@RequestBody PatientReqDto patient)
    {
        return super.save(patient);
    }

    @GetMapping("/getById/{id}")
    @Override
    public PatientResDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public PatientResDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public PatientResDto update (@RequestBody PatientReqDto patient) throws DeletedException
    {
        return super.update(patient);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }


    @PostMapping("/makeAppointment/{patientId}&{drFName}&{drLName}&{day}&{hour}")
    @Override
    public Boolean makeAppointment(@PathVariable Long patientId,
                                   @PathVariable String drFName,
                                   @PathVariable String drLName,
                                   @PathVariable String day,
                                   @PathVariable String hour) throws Exception
    {
        //httpServletRequest.getPathInfo()
        return patientService.makeAppointment(patientId, drFName, drLName, day, hour);
    }
}
