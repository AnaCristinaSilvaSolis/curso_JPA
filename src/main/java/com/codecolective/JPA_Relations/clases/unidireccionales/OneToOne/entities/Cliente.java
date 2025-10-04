package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "customer")
public class Cliente {
    @Id
    /*@GeneratedValue (strategy = GenerationType.IDENTITY)*/
    private int id_customer;
    private String name;
    private String ocupation;

    @OneToOne
    private Cliente cliente;

}
