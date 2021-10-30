package com.ironhack.animaladoption.edgeservice.service;

import com.ironhack.animaladoption.edgeservice.dto.AdopterDto;
import com.ironhack.animaladoption.edgeservice.dto.AdoptionConfirmationDto;
import com.ironhack.animaladoption.edgeservice.dto.AnimalDto;
import com.ironhack.animaladoption.edgeservice.dto.AvailableAnimalDto;

import java.util.List;

public interface AdoptionService {
    List<AnimalDto> getAvailableAnimals(AvailableAnimalDto availableAnimalDto);

    AdoptionConfirmationDto adoptAnimal(AdopterDto adopterDto);

    List<AnimalDto> getAllAvailableAnimals();
}
