package com.hospital.managment.patient;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController extends BaseController<PatientService, PatientDto>
{
    public PatientController(PatientService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public List<PatientDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public PatientDto save(@RequestBody PatientDto patient)
    {
        return super.save(patient);
    }

    @GetMapping("/getById/{id}")
    @Override
    public PatientDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public PatientDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public PatientDto update (@RequestBody PatientDto patient) throws DeletedException
    {
        return super.update(patient);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }
}
