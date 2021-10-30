package com.ironhack.animaladoption.edgeservice.dto;

import com.ironhack.animaladoption.edgeservice.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionConfirmationDto {

    AdopterDto adopterDto;
    AnimalDto animalDto;
    Status adoptionStatus;


}
