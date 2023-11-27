package com.hospital.managment.bill;

import com.hospital.base.exception.DeletedException;
import com.hospital.base.mapper.IBaseMapper;
import com.hospital.base.repository.IBaseRepository;
import com.hospital.base.service.BaseService;
import com.hospital.managment.patient.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BillService extends BaseService<BillEntity, BillReqDto, BillResDto>
{
    private final PatientRepository patientRepository;
    public BillService(IBaseRepository<BillEntity> baseRepository, IBaseMapper<BillEntity, BillReqDto, BillResDto> baseMapper, PatientRepository patientRepository)
    {
        super(baseRepository, baseMapper);
        this.patientRepository = patientRepository;
    }

    public ResponseEntity<String> billDetail(Long id) throws DeletedException
    {
        ResponseEntity<BillResDto> dto = super.getById(id);
        double result = Objects.requireNonNull(dto.getBody()).getRoomCost() + dto.getBody().getLabCost() + dto.getBody().getMedCost();

        PatientEntity patientEntity = patientRepository.findById(id).get();

        String print = "";
        print += "Patient Detail: \n"
                + "Full Name: " + patientEntity.getFirstName() + " " + patientEntity.getLastName() + "\n"
                + "National Code: " + patientEntity.getNCode() + "\n"
                + "Phone Number: " + patientEntity.getPhone() + "\n"
                + "E-Mail: " + patientEntity.getEmail() + "\n"
                + "Bill Detail: \n{ \n"
                + "\tBill Number: " + dto.getBody().getBillNumber() + "\n"
                + "\tRoom Cost: " + dto.getBody().getRoomCost() + " $\n"
                + "\tMedicinely Cost: " + dto.getBody().getMedCost() + " $\n"
                + "\tLaboratory Cost: " + dto.getBody().getLabCost() + " $\n"
                + "\tAll Costs: " + result + " $" +"\n}";

        return new ResponseEntity<>(print, HttpStatus.OK);
    }
}
