package com.hospital.managment.hospital;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hospitals")
public class HospitalController extends BaseController<HospitalService, HospitalDto>
{
    public HospitalController(HospitalService hospitalService)
    {
        super(hospitalService);
    }


    @GetMapping("/getAll")
    @Override
    public List<HospitalDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public HospitalDto save(@RequestBody HospitalDto hospital)
    {
        return super.save(hospital);
    }

    @GetMapping("/getById/{id}")
    @Override
    public HospitalDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public HospitalDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public HospitalDto update (@RequestBody HospitalDto hospital) throws DeletedException
    {
        return super.update(hospital);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }


//    @ExceptionHandler(DeletedException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public DeletedException deleted()
//    {
//        return new DeletedException();
//    }
}
