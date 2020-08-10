package com.springframework.sbpetclinic.repositories;

import com.springframework.sbpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 10, August , 2020
 * at 5:20 PM
 */
public interface VetRepository extends CrudRepository<Vet,Long> {
}
