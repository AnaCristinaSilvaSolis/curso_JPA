package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.repository;

import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities.Pasaporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasaporteRepository extends JpaRepository<Pasaporte, Long> {
}
