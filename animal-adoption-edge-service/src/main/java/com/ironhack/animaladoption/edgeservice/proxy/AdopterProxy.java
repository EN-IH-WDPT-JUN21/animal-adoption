package com.ironhack.animaladoption.edgeservice.proxy;

import com.ironhack.animaladoption.edgeservice.dto.AdopterDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("ADOPTER-SERVICE")
public interface AdopterProxy {

    @PostMapping("/api/adopters")
    AdopterDto adoptAnimal(@RequestBody AdopterDto adopter);
}
