package com.hospital.managment.administrativeStaff;


//import com.hospital.managment.doctor.DoctorEntity;
//import com.hospital.managment.doctor.DoctorRepository;
import com.hospital.managment.staff.StaffEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Table(name = "administrativeStaff")
@Inheritance(strategy = InheritanceType.JOINED)
public class AdministrativeStaffEntity extends StaffEntity
{
//    @Enumerated(EnumType.STRING)
//    private Enum<AdministrativeStaffType> post;
}
