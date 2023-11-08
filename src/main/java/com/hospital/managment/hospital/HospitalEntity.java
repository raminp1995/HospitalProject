package com.hospital.managment.hospital;

import com.hospital.base.model.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "hospital")
public class HospitalEntity extends BaseEntity
{

    @Column
    private String name;
}
