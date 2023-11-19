package com.hospital.managment.payment;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper implements IBaseMapper<PaymentEntity, PaymentReqDto, PaymentResDto>
{
    @Override
    public PaymentEntity dtoToEntity(PaymentReqDto dto)
    {
        PaymentEntity payment = new PaymentEntity();
        BeanUtils.copyProperties(dto, payment);
        return payment;
    }

    @Override
    public PaymentResDto entityToDto(PaymentEntity entity)
    {
        PaymentResDto paymentDto = new PaymentResDto();
        BeanUtils.copyProperties(entity, paymentDto);
        return paymentDto;
    }
}
