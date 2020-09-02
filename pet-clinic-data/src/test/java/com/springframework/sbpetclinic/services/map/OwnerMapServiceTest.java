package com.springframework.sbpetclinic.services.map;

import com.springframework.sbpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 02, September , 2020
 * at 10:41 PM
 */
class OwnerMapServiceTest {

    final Long ownerId = 1L;
    final String lastName = "Smith";
    OwnerMapService ownerMapService ;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(),new PetMapService());
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void saveExistingId() {
        Owner owner2 = new Owner();
        Long id = 2L;
        owner2.setId(id);
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id,savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner = new Owner();
        Owner savedOwner = ownerMapService.save(owner);
        assertNotNull(owner);
        assertNotNull(owner.getId());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void findByLastName() {
        Owner smith = ownerMapService.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId,smith.getId());
    }
    @Test
    void findByLastNameNotFound() {
        Owner smith = ownerMapService.findByLastName("riad");
        assertNull(smith);
    }
}