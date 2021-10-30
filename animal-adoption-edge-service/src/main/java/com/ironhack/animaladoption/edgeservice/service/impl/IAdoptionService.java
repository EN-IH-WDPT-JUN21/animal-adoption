package com.ironhack.animaladoption.edgeservice.service.impl;

import com.ironhack.animaladoption.edgeservice.dto.*;
import com.ironhack.animaladoption.edgeservice.enums.Status;
import com.ironhack.animaladoption.edgeservice.proxy.AdopterProxy;
import com.ironhack.animaladoption.edgeservice.proxy.AnimalProxy;
import com.ironhack.animaladoption.edgeservice.service.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
public class IAdoptionService implements AdoptionService {


    @Autowired
    AnimalProxy animalProxy;

    @Autowired
    AdopterProxy adopterProxy;


    @Override
    public List<AnimalDto> getAvailableAnimals(AvailableAnimalDto availableAnimalDto) {
        List<AnimalDto> animals = new ArrayList<>();

        boolean isAgeRange = availableAnimalDto.getAgeTo()!=null && availableAnimalDto.getAgeFrom()!=null;

        if(isAgeRange) {
            animals = animalProxy.getAvailableAnimalsByAge(availableAnimalDto.getAgeFrom(),
                    availableAnimalDto.getAgeTo());
        }

        if(isAgeRange && availableAnimalDto.getType()!=null) {

            animals.stream().filter(animal -> animal.getType().equals(availableAnimalDto.getType()));

        } else {
            animals = animalProxy.getAvailableAnimalsByType(availableAnimalDto.getType());
        }

        return animals;

    }

    @Override
    public AdoptionConfirmationDto adoptAnimal(AdoptionRequestDto requestDto) {

        AdopterDto adopterDto = adopterProxy.adoptAnimal(requestDto.getAdopter());
        AnimalDto animalDto = animalProxy.findAnimalById(requestDto.getAnimalId());

       return new AdoptionConfirmationDto(adopterDto,animalDto,
                Status.ADOPTED);

    }

    @Override
    public List<AnimalDto> getAllAvailableAnimals() {
        return animalProxy.getAllAvailableAnimals();
    }
}
