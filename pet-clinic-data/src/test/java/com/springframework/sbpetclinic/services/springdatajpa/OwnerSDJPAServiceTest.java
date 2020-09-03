package com.springframework.sbpetclinic.services.springdatajpa;

import com.springframework.sbpetclinic.model.Owner;
import com.springframework.sbpetclinic.repositories.OwnerRepository;
import com.springframework.sbpetclinic.repositories.PetRepository;
import com.springframework.sbpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 02, September , 2020
 * at 11:50 PM
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJPAServiceTest {
    public static final String LAST_NAME = "Smith";
    @Mock
     OwnerRepository ownerRepository;
    @Mock
     PetRepository petRepository;
    @Mock
     PetTypeRepository petTypeRepository;

    @InjectMocks
     OwnerSDJPAService service;
    Owner returnOwner;
    @BeforeEach
    void setup() {
        returnOwner = new Owner();
        returnOwner.setId(1l);
        returnOwner.setLastName(LAST_NAME);
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = service.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME,smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();

        Owner owner1 = new Owner();
        owner1.setId(1l);
        Owner owner2 = new Owner();
        owner2.setId(2l);

        returnOwnerSet.add(owner1);
        returnOwnerSet.add(owner2);

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2,owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = service.findById(1l);
        assertNotNull(owner);
    }
    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner = service.findById(1l);
        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = new Owner();
        ownerToSave.setId(1L);

        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner savedOwner =service.save(ownerToSave);

        assertNotNull(savedOwner);

        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnOwner);
        // default is 1 times
        verify(ownerRepository , times(1)).delete(any());
    }

    @Test
    void deleteById() {
    }
}