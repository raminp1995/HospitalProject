package com.hospital.managment.payment;

import com.hospital.base.controller.BaseController;
import com.hospital.base.exception.DeletedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController extends BaseController<PaymentService, PaymentReqDto, PaymentResDto>
{
    public PaymentController(PaymentService service)
    {
        super(service);
    }

    @GetMapping("/getAll")
    @Override
    public ResponseEntity<List<PaymentResDto>> getAll()
    {
        return super.getAll();
    }


    @PostMapping("/create")
    @Override
    public ResponseEntity<PaymentResDto> save(@RequestBody PaymentReqDto payment)
    {
        return super.save(payment);
    }

    @GetMapping("/getById/{id}")
    @Override
    public ResponseEntity<PaymentResDto> getById(@PathVariable Long id) throws DeletedException
    {
        return super.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @Override
    public ResponseEntity<PaymentResDto> getByName(@PathVariable String name) throws Exception
    {
        return super.getByName(name);
    }

    @PutMapping("/update")
    @Override
    public ResponseEntity<PaymentResDto> update (@RequestBody PaymentReqDto payment) throws DeletedException
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
