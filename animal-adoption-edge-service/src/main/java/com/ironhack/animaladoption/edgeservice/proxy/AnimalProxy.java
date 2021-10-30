package com.ironhack.animaladoption.edgeservice.proxy;

import com.ironhack.animaladoption.edgeservice.dto.AnimalDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@FeignClient("ANIMAL-SEARCH-SERVICE")
public interface AnimalProxy {

    @GetMapping("/api/animals/available")
    List<AnimalDto> getAllAvailableAnimals();

    @GetMapping("/api/animals/available/{id}")
    AnimalDto findAnimalById(@PathVariable(name="id") Long animalId);

    @GetMapping("/api/animals/available/{type}")
    List<AnimalDto> getAvailableAnimalsByType(@PathVariable(name="type") String type);

    @GetMapping("/api/animals/available/{ageFrom}/{ageTo}")
    List<AnimalDto> getAvailableAnimalsByAge(@PathVariable(name="ageFrom") Long ageFrom,
                                             @PathVariable(name="ageTo") Long ageTo);
    @PutMapping("api/animals/{id}")
    AnimalDto updateAnimal(@PathVariable(name="id") Long id, @RequestBody @Valid AnimalDto animalDto);


}
