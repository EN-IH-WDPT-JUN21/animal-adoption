package com.ironhack.animaladoption.edgeservice.service;

import com.ironhack.animaladoption.edgeservice.dto.AdoptionConfirmationDto;
import com.ironhack.animaladoption.edgeservice.dto.AdoptionRequestDto;
import com.ironhack.animaladoption.edgeservice.dto.AnimalDto;
import com.ironhack.animaladoption.edgeservice.dto.AvailableAnimalDto;

import java.util.List;

public interface AdoptionService {
    List<AnimalDto> getAvailableAnimals(AvailableAnimalDto availableAnimalDto);

    AdoptionConfirmationDto adoptAnimal(AdoptionRequestDto adoptionRequestDto);

    List<AnimalDto> getAllAvailableAnimals();
}
