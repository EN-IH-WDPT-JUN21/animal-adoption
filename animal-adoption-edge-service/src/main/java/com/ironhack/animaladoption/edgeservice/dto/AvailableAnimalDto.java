package com.ironhack.animaladoption.edgeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AvailableAnimalDto {

    private Long ageFrom;
    private Long ageTo;
    private String type;
}
