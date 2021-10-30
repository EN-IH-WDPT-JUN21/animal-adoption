package com.Ironhack.miniadopterprojectadopter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {

    private Long id;
    private String name;
    private String type;
    private Long age;
    private boolean available;

}
