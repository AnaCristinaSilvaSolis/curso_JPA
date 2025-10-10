package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table (name = "People")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ciudadano {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cedula;
    private String name;

    @Column (name = "edad")
    private int age;

    @Column (name = "fecha_de_creacion")
    private LocalDate creationDate;

    @Column (name = "salario")
    private BigDecimal salary;
}
