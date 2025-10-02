package com.codecolective.JPA_Relations.entities.unidireccionales.OneToOne;

import jakarta.persistence.*;
import lombok.*;

@Entity //conectar la clase con la BD
@Table (name = "passport") //nombrar la tabla de la BD
@Getter
@Setter
@ToString
@NoArgsConstructor //constructor vacío
@AllArgsConstructor //constructor completo
public class Pasaporte {
    @Id //llave primaria
    @GeneratedValue (strategy = GenerationType.IDENTITY) //forma de generar la llave (auto incrementable)
    private Long id_passport;
    private String numero;

    @OneToOne
    private Ciudadano ciudadano;
}
