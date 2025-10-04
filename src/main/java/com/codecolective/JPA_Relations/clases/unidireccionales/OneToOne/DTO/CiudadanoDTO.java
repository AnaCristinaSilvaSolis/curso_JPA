package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CiudadanoDTO {
    private String name;
    private int age;
}
