package com.hospital.managment.administrativeStaff;

import com.hospital.base.mapper.IBaseMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AdminStaffMapper implements IBaseMapper<AdministrativeStaffEntity, AdminStaffDto>
{
    @Override
    public AdministrativeStaffEntity dtoToEntity(AdminStaffDto dto)
    {
        AdministrativeStaffEntity administrativeStaff = new AdministrativeStaffEntity();
        BeanUtils.copyProperties(dto, administrativeStaff);
        return administrativeStaff;
    }

    @Override
    public AdminStaffDto entityToDto(AdministrativeStaffEntity entity)
    {
        AdminStaffDto adminStaffDto = new AdminStaffDto();
        BeanUtils.copyProperties(entity, adminStaffDto);
        return adminStaffDto;
    }
}
