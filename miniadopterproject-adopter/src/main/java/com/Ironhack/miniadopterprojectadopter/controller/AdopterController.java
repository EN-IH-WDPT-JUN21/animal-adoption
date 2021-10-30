package com.Ironhack.miniadopterprojectadopter.controller;

import com.Ironhack.miniadopterprojectadopter.dao.Adopter;
import com.Ironhack.miniadopterprojectadopter.dto.AdopterDTO;
import com.Ironhack.miniadopterprojectadopter.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class AdopterController {

    @Autowired
    AdopterService adopterService;

    @PostMapping("/adopters")
    @ResponseStatus(HttpStatus.CREATED)
    public Adopter adoptAnimal(@RequestBody @Valid AdopterDTO adopterDTO){
        return adopterService.adopt(adopterDTO);
    }





}
