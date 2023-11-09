package com.hospital.managment.administrativeStaff;


//import com.hospital.managment.doctor.DoctorEntity;
//import com.hospital.managment.doctor.DoctorRepository;
import com.hospital.managment.staff.StaffEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class AdministrativeStaffEntity extends StaffEntity
{
    private String name;
    private String post;
    //private AdminStaffService adminService;


//    public String doctorInfo(String name) throws Exception
//    {
//        return adminService.doctorInformation(name);
//    }

    public boolean login()
    {
        return false;
    }

    public String patientBill()
    {
        return "";
    }

    public void account()
    {

    }
}
