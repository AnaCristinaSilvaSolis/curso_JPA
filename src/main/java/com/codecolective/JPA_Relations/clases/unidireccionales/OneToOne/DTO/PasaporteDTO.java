package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.DTO;

import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities.Ciudadano;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasaporteDTO {
    private String numero;
    private Ciudadano ciudadano;

}

