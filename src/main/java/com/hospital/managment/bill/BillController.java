package com.hospital.managment.bill;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import com.hospital.managment.administrativeStaff.AdminStaffDto;
import com.hospital.managment.administrativeStaff.AdminStaffService;
import com.hospital.managment.doctor.DoctorDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController extends BaseController<BillService, BillDto>
{

    //private final BillService service;
    public BillController(BillService service)
    {
        super(service);
        //this.service = service;
    }


    @GetMapping("/getAll")
    @Override
    public List<BillDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public BillDto save(@RequestBody BillDto billDto)
    {
        return super.save(billDto);
    }

    @GetMapping("/getById/{id}")
    @Override
    public BillDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public BillDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public BillDto update (@RequestBody BillDto billDto) throws DeletedException
    {
        return super.update(billDto);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }


}
