package com.hospital.managment.doctor;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController extends BaseController<DoctorService, DoctorDto>
{
    public DoctorController(DoctorService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public List<DoctorDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public DoctorDto save(@RequestBody DoctorDto doctor)
    {
        return super.save(doctor);
    }

    @GetMapping("/getById/{id}")
    @Override
    public DoctorDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public DoctorDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public DoctorDto update (@RequestBody DoctorDto doctor) throws DeletedException
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
