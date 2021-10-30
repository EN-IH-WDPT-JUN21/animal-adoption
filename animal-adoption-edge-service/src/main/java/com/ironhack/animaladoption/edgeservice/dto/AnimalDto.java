package com.ironhack.animaladoption.edgeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDto {

    private Long id;
    private String name;
    private String type;
    private Integer age;
    private boolean available;

}
