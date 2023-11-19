package com.hospital.managment.bill;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.patient.*;
import org.springframework.stereotype.Service;

@Service
public class BillService extends BaseService<BillEntity, BillReqDto, BillResDto>
{
    private final PatientRepository patientRepository;
    public BillService(IBaseRepository<BillEntity> baseRepository, IBaseMapper<BillEntity, BillReqDto, BillResDto> baseMapper, PatientRepository patientRepository)
    {
        super(baseRepository, baseMapper);
        this.patientRepository = patientRepository;
    }

    public String billDetail(Long id) throws DeletedException
    {
        BillResDto dto = super.getById(id);
        double result = dto.getRoomCost() + dto.getLabCost() + dto.getMedCost();

        PatientEntity patientEntity = patientRepository.findById(id).get();

        String print = "";
        print += "Patient Detail: \n"
                + "Full Name: " + patientEntity.getFirstName() + " " + patientEntity.getLastName() + "\n"
                + "National Code: " + patientEntity.getNCode() + "\n"
                + "Phone Number: " + patientEntity.getPhone() + "\n"
                + "E-Mail: " + patientEntity.getEMail() + "\n"
                + "Bill Detail: \n{ \n"
                + "\tBill Number: " + dto.getBillNumber() + "\n"
                + "\tRoom Cost: " + dto.getRoomCost() + " $\n"
                + "\tMedicinely Cost: " + dto.getMedCost() + " $\n"
                + "\tLaboratory Cost: " + dto.getLabCost() + " $\n"
                + "\tAll Costs: " + result + " $" +"\n}";

        return print;
    }
}
