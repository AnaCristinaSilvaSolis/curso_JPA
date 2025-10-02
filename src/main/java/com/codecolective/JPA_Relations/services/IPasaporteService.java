package com.codecolective.JPA_Relations.services;

import com.codecolective.JPA_Relations.entities.unidireccionales.OneToOne.Pasaporte;

import java.util.List;

public interface IPasaporteService {

    void save(Pasaporte pasaporte); //create
    List<Pasaporte> findAll(); //read
    void deleteById(); //delete

}
