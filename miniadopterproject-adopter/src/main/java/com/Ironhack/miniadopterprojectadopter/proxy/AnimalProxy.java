package com.Ironhack.miniadopterprojectadopter.proxy;

import com.Ironhack.miniadopterprojectadopter.dto.AnimalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("animal-search-service")
public interface AnimalProxy {

    @GetMapping("api/animals/{id}")
    public AnimalDTO findById(@PathVariable("id") Long id);

    @PutMapping("/{id}")
    public AnimalDTO updateStatus(@PathVariable(name="id") Long id,
                                  @RequestBody AnimalDTO animalDTO);

}
