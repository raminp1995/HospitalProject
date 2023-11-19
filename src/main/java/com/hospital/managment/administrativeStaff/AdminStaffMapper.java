package com.hospital.managment.administrativeStaff;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AdminStaffMapper implements IBaseMapper<AdministrativeStaffEntity, AdminStaffReqDto, AdminStaffResDto>
{
    @Override
    public AdministrativeStaffEntity dtoToEntity(AdminStaffReqDto dto)
    {
        AdministrativeStaffEntity administrativeStaff = new AdministrativeStaffEntity();
        BeanUtils.copyProperties(dto, administrativeStaff);
        return administrativeStaff;
    }

    @Override
    public AdminStaffResDto entityToDto(AdministrativeStaffEntity entity)
    {
        AdminStaffResDto adminStaffDto = new AdminStaffResDto();
        BeanUtils.copyProperties(entity, adminStaffDto);
        return adminStaffDto;
    }
}
