package com.springframework.sbpetclinic.repositories;

import com.springframework.sbpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 10, August , 2020
 * at 5:21 PM
 */
public interface VisitRepository extends CrudRepository<Visit,Long> {
}
