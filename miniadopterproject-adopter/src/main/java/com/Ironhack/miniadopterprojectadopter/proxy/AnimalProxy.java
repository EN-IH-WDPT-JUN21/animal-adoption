package com.Ironhack.miniadopterprojectadopter.proxy;

import com.Ironhack.miniadopterprojectadopter.dto.AnimalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("animal-service")
public interface AnimalProxy {

    @GetMapping("api/animals/{id}")
    public AnimalDTO findById(@PathVariable("id") Long id);

}
