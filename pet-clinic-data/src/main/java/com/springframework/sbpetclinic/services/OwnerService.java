package com.springframework.sbpetclinic.services;

import com.springframework.sbpetclinic.model.Owner;

public interface OwnerService extends  CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
