package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities;

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

    @OneToOne //define el tipo de relación 1:1
    @JoinColumn (name = "dueño_pasaporte")
    private Ciudadano ciudadano; //PK cedula es de Ciudadano y es la FK Pasaporte

    @OneToOne
    @JoinColumn (name = "auto_del_dueño")
    private Automovil automovil; //PK id_auto es de Automóvil y es la FK de Pasaporte

}
