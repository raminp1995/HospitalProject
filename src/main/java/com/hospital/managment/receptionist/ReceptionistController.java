package com.hospital.managment.receptionist;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receptionists")
public class ReceptionistController extends BaseController<ReceptionistService, ReceptionistDto>
{
    public ReceptionistController(ReceptionistService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public List<ReceptionistDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public ReceptionistDto save(@RequestBody ReceptionistDto receptionist)
    {
        return super.save(receptionist);
    }

    @GetMapping("/getById/{id}")
    @Override
    public ReceptionistDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public ReceptionistDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public ReceptionistDto update (@RequestBody ReceptionistDto receptionist) throws DeletedException
    {
        return super.update(receptionist);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }
}
