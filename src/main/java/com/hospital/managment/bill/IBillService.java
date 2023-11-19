package com.hospital.managment.bill;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.service.IBaseService;

public interface IBillService extends IBaseService<BillReqDto, BillResDto>
{
    String billDetail(Long id) throws DeletedException;
}
