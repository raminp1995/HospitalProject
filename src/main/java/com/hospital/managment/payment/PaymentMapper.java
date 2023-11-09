package com.hospital.managment.payment;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper implements IBaseMapper<PaymentEntity, PaymentDto>
{
    @Override
    public PaymentEntity dtoToEntity(PaymentDto dto)
    {
        PaymentEntity payment = new PaymentEntity();
        BeanUtils.copyProperties(dto, payment);
        return payment;
    }

    @Override
    public PaymentDto entityToDto(PaymentEntity entity)
    {
        PaymentDto paymentDto = new PaymentDto();
        BeanUtils.copyProperties(entity, paymentDto);
        return paymentDto;
    }
}
