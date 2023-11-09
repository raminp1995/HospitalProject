package com.hospital.managment.payment;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController extends BaseController<PaymentService, PaymentDto>
{
    public PaymentController(PaymentService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public List<PaymentDto> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public PaymentDto save(@RequestBody PaymentDto payment)
    {
        return super.save(payment);
    }

    @GetMapping("/getById/{id}")
    @Override
    public PaymentDto getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public PaymentDto getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public PaymentDto update (@RequestBody PaymentDto payment) throws DeletedException
    {
        return super.update(payment);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void delete(@PathVariable Long id) throws Exception
    {
        super.delete(id);
    }
}
