package com.hospital.managment.doctor;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<DoctorEntity, DoctorDto>
{
    public DoctorService(IBaseRepository<DoctorEntity> baseRepository, IBaseMapper<DoctorEntity, DoctorDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }
}
