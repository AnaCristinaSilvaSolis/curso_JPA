package com.codecolective.JPA_Relations.repository;

import com.codecolective.JPA_Relations.entities.unidireccionales.OneToOne.Pasaporte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasaporteRepository extends CrudRepository<Pasaporte, Long> {
}
