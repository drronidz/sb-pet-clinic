package com.springframework.sbpetclinic.services.springdatajpa;

import com.springframework.sbpetclinic.model.Owner;
import com.springframework.sbpetclinic.repositories.OwnerRepository;
import com.springframework.sbpetclinic.repositories.PetRepository;
import com.springframework.sbpetclinic.repositories.PetTypeRepository;
import com.springframework.sbpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 10, August , 2020
 * at 5:48 PM
 */
@Service
@Profile({"springdatajpa"})
public  class OwnerSDJPAService
        implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJPAService(OwnerRepository ownerRepository,
                             PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        System.out.println("#####################################");
        System.out.println("#####################################");
        System.out.println("#####################################");
        System.out.println("#####################################");
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {

        ownerRepository.deleteById(aLong);
    }
}
