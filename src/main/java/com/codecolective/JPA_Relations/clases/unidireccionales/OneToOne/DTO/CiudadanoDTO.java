package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CiudadanoDTO {
    private String name;
    private int age;
    private BigDecimal salary;
}
