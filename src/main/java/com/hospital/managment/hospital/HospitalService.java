package com.hospital.managment.hospital;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class HospitalService extends BaseService<HospitalEntity, HospitalDto>
{

    public HospitalService(IBaseRepository<HospitalEntity> baseRepository, IBaseMapper<HospitalEntity, HospitalDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }
}
