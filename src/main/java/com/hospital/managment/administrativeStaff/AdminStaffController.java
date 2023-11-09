package com.hospital.managment.administrativeStaff;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrativeStaffs")
public class AdminStaffController extends BaseController<AdminStaffService, AdminStaffDto>
{

    //private IAdminService adminService;

    public AdminStaffController(AdminStaffService service)
    {
        super(service);
    }


    @GetMapping("/getAll")
    @Override
    public List<AdminStaffDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public AdminStaffDto save(@RequestBody AdminStaffDto adminStaffDto)
    {
        return super.save(adminStaffDto);
    }

    @GetMapping("/getById/{id}")
    @Override
    public AdminStaffDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public AdminStaffDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public AdminStaffDto update (@RequestBody AdminStaffDto adminStaffDto) throws DeletedException
    {
        return super.update(adminStaffDto);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }

//    @GetMapping("/doctorDetail/{name}")
//    public String doctorInfo(@PathVariable String name) throws Exception
//    {
//        return adminService.doctorInformation(name);
//    }
}
