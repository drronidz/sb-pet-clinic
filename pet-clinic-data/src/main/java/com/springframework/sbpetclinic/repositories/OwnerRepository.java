package com.springframework.sbpetclinic.repositories;

import com.springframework.sbpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 10, August , 2020
 * at 5:14 PM
 */
public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
}
