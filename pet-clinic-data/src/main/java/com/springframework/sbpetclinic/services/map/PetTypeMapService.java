package com.springframework.sbpetclinic.services.map;

import com.springframework.sbpetclinic.model.PetType;
import com.springframework.sbpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 07, August , 2020
 * at 5:16 PM
 */
@Service
@Profile({"default","map"})

public  class PetTypeMapService
        extends AbstractMapService<PetType,Long>
        implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
