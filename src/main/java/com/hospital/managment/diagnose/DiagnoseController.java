package com.hospital.managment.diagnose;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnoses")
public class DiagnoseController extends BaseController<DiagnoseService, DiagnoseReqDto, DiagnoseResDto>
{
    public DiagnoseController(DiagnoseService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public List<DiagnoseResDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public DiagnoseResDto save(@RequestBody DiagnoseReqDto diagnose)
    {
        return super.save(diagnose);
    }

    @GetMapping("/getById/{id}")
    @Override
    public DiagnoseResDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public DiagnoseResDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public DiagnoseResDto update (@RequestBody DiagnoseReqDto diagnose) throws DeletedException
    {
        return super.update(diagnose);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }
}
