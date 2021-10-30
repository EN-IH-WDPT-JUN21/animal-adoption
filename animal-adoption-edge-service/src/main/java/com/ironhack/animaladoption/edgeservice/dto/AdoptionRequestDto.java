package com.ironhack.animaladoption.edgeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionRequestDto {

    AdopterDto adopter;
    Long animalId;

}
