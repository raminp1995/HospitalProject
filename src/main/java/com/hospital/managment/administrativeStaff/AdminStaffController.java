package com.hospital.managment.administrativeStaff;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import com.hospital.managment.doctor.DoctorReqDto;
import com.hospital.managment.doctor.DoctorResDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrativeStaffs")
public class AdminStaffController extends BaseController<AdminStaffService, AdminStaffReqDto, AdminStaffResDto>
{

    private final AdminStaffService service;
    public AdminStaffController(AdminStaffService service)
    {
        super(service);
        this.service = service;
    }


    @GetMapping("/getAll")
    @Override
    public ResponseEntity<List<AdminStaffResDto>> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public ResponseEntity<AdminStaffResDto> save(@RequestBody AdminStaffReqDto adminStaffDto)
    {
        return super.save(adminStaffDto);
    }

    @GetMapping("/getById/{id}")
    @Override
    public ResponseEntity<AdminStaffResDto> getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public ResponseEntity<AdminStaffResDto> getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public ResponseEntity<AdminStaffResDto> update (@RequestBody AdminStaffReqDto adminStaffDto) throws DeletedException
    {
        return super.update(adminStaffDto);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }

    @GetMapping("/doctorDetail/{firstName}&{lastName}")
    public ResponseEntity<DoctorResDto> doctorInformation(@PathVariable String firstName, @PathVariable String lastName) throws Exception
    {
        return service.doctorInformation(firstName, lastName);
    }


}
