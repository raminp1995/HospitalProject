package com.hospital.managment.receptionist;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receptionists")
public class ReceptionistController extends BaseController<ReceptionistService, ReceptionistReqDto, ReceptionistResDto>
{
    public ReceptionistController(ReceptionistService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public List<ReceptionistResDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public ReceptionistResDto save(@RequestBody ReceptionistReqDto receptionist)
    {
        return super.save(receptionist);
    }

    @GetMapping("/getById/{id}")
    @Override
    public ReceptionistResDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public ReceptionistResDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public ReceptionistResDto update (@RequestBody ReceptionistReqDto receptionist) throws DeletedException
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
