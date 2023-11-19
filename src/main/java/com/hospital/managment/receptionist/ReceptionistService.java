package com.hospital.managment.receptionist;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ReceptionistService extends BaseService<ReceptionistEntity, ReceptionistReqDto, ReceptionistResDto>
{
    public ReceptionistService(IBaseRepository<ReceptionistEntity> baseRepository, IBaseMapper<ReceptionistEntity, ReceptionistReqDto, ReceptionistResDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }
}
