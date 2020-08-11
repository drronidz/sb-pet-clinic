package com.springframework.sbpetclinic.services.springdatajpa;

import com.springframework.sbpetclinic.model.Visit;
import com.springframework.sbpetclinic.repositories.VisitRepository;
import com.springframework.sbpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 11, August , 2020
 * at 1:57 AM
 */
@Service
@Profile("springdatajpa")
public class VisitSDJPAService
       implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSDJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
