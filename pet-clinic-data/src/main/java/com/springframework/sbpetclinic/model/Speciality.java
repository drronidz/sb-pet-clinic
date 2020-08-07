package com.springframework.sbpetclinic.model;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 07, August , 2020
 * at 5:02 PM
 */
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
