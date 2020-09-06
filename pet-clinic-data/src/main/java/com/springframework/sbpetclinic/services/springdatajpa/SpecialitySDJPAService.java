package com.springframework.sbpetclinic.services.springdatajpa;

import com.springframework.sbpetclinic.model.Speciality;
import com.springframework.sbpetclinic.repositories.SpecialityRepository;
import com.springframework.sbpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 11, August , 2020
 * at 1:21 AM
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJPAService implements SpecialtyService {
    private final SpecialityRepository specialityRepository;

    public SpecialitySDJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
