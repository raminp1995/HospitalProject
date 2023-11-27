package com.hospital.managment.bill;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.service.IBaseService;
import org.springframework.http.ResponseEntity;

public interface IBillService extends IBaseService<BillReqDto, BillResDto>
{
    ResponseEntity<String> billDetail(Long id) throws DeletedException;
}
