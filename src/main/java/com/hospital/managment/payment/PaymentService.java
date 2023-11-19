package com.hospital.managment.payment;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PaymentService extends BaseService<PaymentEntity, PaymentReqDto, PaymentResDto>
{
    public PaymentService(IBaseRepository<PaymentEntity> baseRepository, IBaseMapper<PaymentEntity, PaymentReqDto, PaymentResDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }
}
