package com.hospital.managment.bill;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.patient.PatientService;
import org.springframework.stereotype.Service;

@Service
public class BillService extends BaseService<BillEntity, BillDto>
{
    public BillService(IBaseRepository<BillEntity> baseRepository, IBaseMapper<BillEntity, BillDto> baseMapper)
    {
        super(baseRepository, baseMapper);
    }

    public BillDto getById(Long id) throws DeletedException
    {
        BillDto billDto = super.getById(id);
        billDto.setAllCost(billDto.getRoomCost() + billDto.getLabCost() + billDto.getMedCost());
        return billDto;
    }
}
