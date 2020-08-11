package com.springframework.sbpetclinic.services.map;

import com.springframework.sbpetclinic.model.Visit;
import com.springframework.sbpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * project Name : sb-pet-clinic
 * Created by DRRONIDZ
 * on 11, August , 2020
 * at 1:48 AM
 */

@Service
@Profile({"default","map"})
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {

        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {
        if(     visit.getPet() == null ||
                visit.getPet().getOwner() == null ||
                visit.getPet().getId() == null) {

            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {

        return super.findById(id);
    }
}
