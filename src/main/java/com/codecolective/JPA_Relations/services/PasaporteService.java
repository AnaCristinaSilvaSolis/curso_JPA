package com.codecolective.JPA_Relations.services;

import com.codecolective.JPA_Relations.entities.unidireccionales.OneToOne.Pasaporte;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //para evitar el Autowired
public class PasaporteService implements IPasaporteService{

    private Pasaporte pasaporte;

    @Override
    public void save(Pasaporte pasaporte) {

    }

    @Override
    public List<Pasaporte> findAll() {
        return List.of();
    }

    @Override
    public void deleteById() {

    }
}
