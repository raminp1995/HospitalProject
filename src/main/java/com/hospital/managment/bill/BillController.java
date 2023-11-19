package com.hospital.managment.bill;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController extends BaseController<BillService, BillReqDto, BillResDto> implements IBillService
{

    private final BillService service;
    public BillController(BillService service)
    {
        super(service);
        this.service = service;
    }


    @GetMapping("/getAll")
    @Override
    public List<BillResDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public BillResDto save(@RequestBody BillReqDto billDto)
    {
        return super.save(billDto);
    }

    @GetMapping("/billDetail/{id}")
    @Override
    public String billDetail(@PathVariable Long id) throws DeletedException
    {
        return service.billDetail(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public BillResDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public BillResDto update (@RequestBody BillReqDto billDto) throws DeletedException
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
