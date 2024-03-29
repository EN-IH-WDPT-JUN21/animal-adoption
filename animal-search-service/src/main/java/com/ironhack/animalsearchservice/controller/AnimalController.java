package com.ironhack.animalsearchservice.controller;

import com.ironhack.animalsearchservice.dao.Animal;
import com.ironhack.animalsearchservice.dto.AnimalDTO;
import com.ironhack.animalsearchservice.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Animal> findAll(){
        return animalService.findAll();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Animal findById(@PathVariable Long id){
        return animalService.findById(id);
    }

    @GetMapping("/type/{type}")
    @ResponseStatus(HttpStatus.OK)
    public List<Animal> findByType(@PathVariable String type){
        return animalService.findByType(type);
    }

    @GetMapping("/{ageFrom}/{ageTo}")
    @ResponseStatus(HttpStatus.OK)
    public List<Animal> findByAgeBetween(@PathVariable(name="ageFrom") Long ageFrom,
                                         @PathVariable(name="ageTo") Long ageTo){
        return animalService.findByAgeBetween(ageFrom, ageTo);
    }

    @GetMapping("/available")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Animal> findAllAvailable(){
        return animalService.findAllAvailable();
    }

    @GetMapping("/available/{type}")
    @ResponseStatus(HttpStatus.OK)
    public List<Animal> findAvailableByType(@PathVariable String type){
        return animalService.findAvailableByType(type);
    }

    @GetMapping("/available/{ageFrom}/{ageTo}")
    @ResponseStatus(HttpStatus.OK)
    public List<Animal> findAvailableByAgeBetween(@PathVariable(name="ageFrom") Long ageFrom,
                                         @PathVariable(name="ageTo") Long ageTo){
        return animalService.findAvilableByAgeBetween(ageFrom, ageTo);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Animal updateStatus(@PathVariable(name="id") Long id, @RequestBody AnimalDTO animalDTO){
        return animalService.updateStatus(id, animalDTO);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Animal addAnimal(@RequestBody AnimalDTO animalDTO){
        return animalService.addAnimal(animalDTO);
    }

    @PutMapping("/{id}/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Animal updateAnimal(@PathVariable Long id,
                               @RequestBody AnimalDTO animalDTO){
        return animalService.updateAnimal(id, animalDTO);
    }



}
