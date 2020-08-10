package com.springframework.sbpetclinic.repositories;

import com.springframework.sbpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 10, August , 2020
 * at 5:17 PM
 */
public interface PetRepository extends CrudRepository<Pet,Long> {
}
