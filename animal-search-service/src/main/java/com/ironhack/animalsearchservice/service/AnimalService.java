package com.ironhack.animalsearchservice.service;

import com.ironhack.animalsearchservice.dao.Animal;
import com.ironhack.animalsearchservice.dto.AnimalDTO;
import com.ironhack.animalsearchservice.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal findById(Long id){
        Optional<Animal> animalOptional = animalRepository.findById(id);
        if(animalOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No animal found with id: " + id);
        return animalOptional.get();
    }

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public List<Animal> findByType(String type) {
        return animalRepository.findByType(type);
    }

    public List<Animal> findByAgeBetween(Long ageFrom, Long ageTo){
        return animalRepository.findByAgeBetween(ageFrom, ageTo);
    }

    public Animal updateStatus(Long id, AnimalDTO animalDTO){
        Animal animal = findById(id);
        animal.setAvailable(animalDTO.isAvailable());
        return animalRepository.save(animal);
    }

}
