package com.springframework.sbpetclinic.model;

import java.time.LocalDate;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 07, August , 2020
 * at 4:56 PM
 */
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
