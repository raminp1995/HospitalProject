package com.hospital.managment.administrativeStaff;


import com.hospital.managment.staff.StaffEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdministrativeStaffEntity extends StaffEntity
{
    private String name;
    private String post;


    public String doctorInfo()
    {
        return "";
    }

    public boolean login()
    {
        return false;
    }

    public String patinetBill()
    {
        return "";
    }

    public void account()
    {

    }
}
