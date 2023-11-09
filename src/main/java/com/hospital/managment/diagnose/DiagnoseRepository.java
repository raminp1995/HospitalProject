package com.hospital.managment.diagnose;

import com.hospital.base.repository.IBaseRepository;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnoseRepository extends IBaseRepository<DiagnoseEntity>
{
    @Override
    @Transient
    default DiagnoseEntity findByName(String name) throws Exception
    {
        return null;
    }
}
