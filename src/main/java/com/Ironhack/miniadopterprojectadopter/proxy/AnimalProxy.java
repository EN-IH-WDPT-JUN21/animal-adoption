package com.Ironhack.miniadopterprojectadopter.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("animal-service")
public interface AnimalProxy {

    @GetMapping("api/animals/{id}")
    public Long getAnimal(@PathVariable("id") Long id);

}
