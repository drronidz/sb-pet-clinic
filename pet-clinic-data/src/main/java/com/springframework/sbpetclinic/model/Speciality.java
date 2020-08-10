package com.springframework.sbpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 07, August , 2020
 * at 5:02 PM
 */
@Entity
@Table(name="specialties")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
