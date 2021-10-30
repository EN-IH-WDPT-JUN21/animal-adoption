package com.Ironhack.miniadopterprojectadopter.service;

import com.Ironhack.miniadopterprojectadopter.dao.Adopter;
import com.Ironhack.miniadopterprojectadopter.dto.AdopterDTO;
import com.Ironhack.miniadopterprojectadopter.dto.AnimalDTO;
import com.Ironhack.miniadopterprojectadopter.proxy.AnimalProxy;
import com.Ironhack.miniadopterprojectadopter.repository.AdopterRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdopterService {

    @Autowired
    AnimalProxy animalProxy;

    @Autowired
    AdopterRepository adopterRepository;

    public Adopter adopt(AdopterDTO adopterDTO) {

        Optional<AnimalDTO> animal =

    }
}
