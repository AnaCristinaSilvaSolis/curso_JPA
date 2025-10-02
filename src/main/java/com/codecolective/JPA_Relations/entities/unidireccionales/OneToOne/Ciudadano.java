package com.codecolective.JPA_Relations.entities.unidireccionales.OneToOne;

import jakarta.persistence.*;

@Entity
@Table (name = "People")
public class Ciudadano {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cedula;
    private String name;
    private int age;
}
