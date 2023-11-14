package com.hospital.managment.bill;

import com.hospital.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface IBillMapper extends IBaseMapper<BillEntity, BillDto>
{
}
