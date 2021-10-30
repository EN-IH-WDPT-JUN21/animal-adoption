package com.Ironhack.miniadopterprojectadopter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdopterDTO {

    @NotBlank
    private String name;

    @NotNull
    private Long pet;


}
