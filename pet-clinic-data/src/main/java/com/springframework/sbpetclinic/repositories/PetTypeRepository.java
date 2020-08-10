package com.springframework.sbpetclinic.repositories;

import com.springframework.sbpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 10, August , 2020
 * at 5:18 PM
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
