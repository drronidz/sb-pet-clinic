package com.springframework.sbpetclinic.services.map;

import com.springframework.sbpetclinic.model.Speciality;
import com.springframework.sbpetclinic.services.SpecialityService;

import java.util.Set;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 09, August , 2020
 * at 1:08 AM
 */
public class SpecialityMapService
        extends AbstractMapService<Speciality,Long>
        implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
