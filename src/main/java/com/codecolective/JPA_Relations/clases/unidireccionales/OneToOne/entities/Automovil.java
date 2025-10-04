package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Automovil {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_auto;
    private String marca;


}
