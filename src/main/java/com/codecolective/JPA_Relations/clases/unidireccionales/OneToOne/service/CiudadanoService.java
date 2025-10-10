package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.service;

import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.DTO.CiudadanoDTO;

import java.util.List;

//Interfaz que define los métodos que se DEBEN CUMPLIR
public interface CiudadanoService {

    //lo que devuelve - lo que hace - lo que necesita para hacerlo
    CiudadanoDTO crearCiudadano(CiudadanoDTO ciudadanoDTO);
    CiudadanoDTO obtenerCiudadano(int cedula);
    List<CiudadanoDTO> traerCiudadanos();
    CiudadanoDTO editarCiudadano(int cedula, CiudadanoDTO ciudadanoDTO);
    String eliminarCiudadano(int cedula);

}
