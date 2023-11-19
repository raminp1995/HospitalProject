package com.hospital.managment.diagnose;

import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class DiagnoseService extends BaseService<DiagnoseEntity, DiagnoseReqDto, DiagnoseResDto>
{
    public DiagnoseService(IBaseRepository<DiagnoseEntity> baseRepository, IBaseMapper<DiagnoseEntity, DiagnoseReqDto, DiagnoseResDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }
}
