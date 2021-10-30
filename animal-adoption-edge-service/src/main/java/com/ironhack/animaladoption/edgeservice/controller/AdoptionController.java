package com.ironhack.animaladoption.edgeservice.controller;

import com.ironhack.animaladoption.edgeservice.dto.AdoptionConfirmationDto;
import com.ironhack.animaladoption.edgeservice.dto.AdoptionRequestDto;
import com.ironhack.animaladoption.edgeservice.dto.AnimalDto;
import com.ironhack.animaladoption.edgeservice.dto.AvailableAnimalDto;
import com.ironhack.animaladoption.edgeservice.proxy.AdopterProxy;
import com.ironhack.animaladoption.edgeservice.proxy.AnimalProxy;
import com.ironhack.animaladoption.edgeservice.service.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpResponse;
import java.util.List;

@RestController("/api/animals")
public class AdoptionController {

    @Autowired
    AdoptionService adoptionService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AnimalDto> getAvailableAnimals(@RequestBody @Valid AvailableAnimalDto availableAnimalDto) {
        return adoptionService.getAvailableAnimals(availableAnimalDto);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AnimalDto> getALlAvailableAnimals() {
        return adoptionService.getAllAvailableAnimals();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AdoptionConfirmationDto adoptAnAnimal(@RequestBody @Valid AdoptionRequestDto adoptionRequestDto) {
       return adoptionService.adoptAnimal(adoptionRequestDto);
    }


}