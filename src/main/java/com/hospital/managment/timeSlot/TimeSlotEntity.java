package com.hospital.managment.timeSlot;

import com.hospital.base.model.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.MapKeyJavaType;
import org.hibernate.annotations.MapKeyType;

import java.io.Serializable;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "timeSlot")
public class TimeSlotEntity extends BaseEntity implements Serializable
{

    @ElementCollection
    private List<String> days = new ArrayList<>();

    @ElementCollection
    private Map<String, Boolean> hours = new HashMap<>();

    //private Boolean isReserved;
}
