package com.hospital.managment.patient;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends BaseService<PatientEntity, PatientDto>
{
    public PatientService(IBaseRepository<PatientEntity> baseRepository, IBaseMapper<PatientEntity, PatientDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }
}
