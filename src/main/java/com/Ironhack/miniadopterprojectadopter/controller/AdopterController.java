package com.Ironhack.miniadopterprojectadopter.controller;

import com.Ironhack.miniadopterprojectadopter.dao.Adopter;
import com.Ironhack.miniadopterprojectadopter.dto.AdopterDTO;
import com.Ironhack.miniadopterprojectadopter.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/adopter")
public class AdopterController {

    @Autowired
    AdopterService adopterService;

    @PostMapping("/adopt")
    public Adopter create(@RequestBody @Valid AdopterDTO adopterDTO){

        return adopterService.adopt(adopterDTO);
    }





}
