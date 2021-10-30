package com.Ironhack.miniadopterprojectadopter.service;

import com.Ironhack.miniadopterprojectadopter.dao.Adopter;
import com.Ironhack.miniadopterprojectadopter.dto.AdopterDTO;
import com.Ironhack.miniadopterprojectadopter.dto.AnimalDTO;
import com.Ironhack.miniadopterprojectadopter.proxy.AnimalProxy;
import com.Ironhack.miniadopterprojectadopter.repository.AdopterRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AdopterService {

    @Autowired
    AnimalProxy animalProxy;

    @Autowired
    AdopterRepository adopterRepository;

    public Adopter adopt(AdopterDTO adopterDTO) {

        AnimalDTO animal = (animalProxy.findById(adopterDTO.getPet()));

        if(animal.isAvailable()){
            Adopter newAdopter = new Adopter(adopterDTO.getName(), adopterDTO.getPet());
            return adopterRepository.save(newAdopter);
        } else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"No pet matching that Id, or that Animal is no longer available");
        }


    }
}
