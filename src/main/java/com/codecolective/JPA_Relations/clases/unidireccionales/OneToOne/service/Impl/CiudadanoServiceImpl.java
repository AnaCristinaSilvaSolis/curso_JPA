package com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.service.Impl;

import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.DTO.CiudadanoDTO;
import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.entities.Ciudadano;
import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.repository.CiudadanoRepository;
import com.codecolective.JPA_Relations.clases.unidireccionales.OneToOne.service.CiudadanoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CiudadanoServiceImpl implements CiudadanoService {
    //-----Siempre necesitamos el repositorio
    /*@Autowired
    private CiudadanoRepository ciudadanoRepository;*/
    private final CiudadanoRepository ciudadanoRepository;


    @Override
    public CiudadanoDTO crearCiudadano(CiudadanoDTO ciudadanoDTO) {

        //Crear entidad a partir del DTO recibido (Convertir DTO a entidad)
        Ciudadano ciudadano = new Ciudadano(); //Paola
        ciudadano.setName(ciudadanoDTO.getName());
        ciudadano.setAge(ciudadanoDTO.getAge());
        ciudadano.setSalary(ciudadanoDTO.getSalary());

        //Guardar el ciudadano creado en la BD
        Ciudadano ciudadanoGuardado = ciudadanoRepository.save(ciudadano);

        //Convertir la entidad de nuevo a DTO
        CiudadanoDTO respuesta = new CiudadanoDTO();
        respuesta.setName(ciudadanoGuardado.getName());
        respuesta.setAge(ciudadanoDTO.getAge());
        respuesta.setSalary(ciudadanoGuardado.getSalary());

        //Devolver el DTO
        return respuesta;
    }

    @Override
    public CiudadanoDTO obtenerCiudadano(int cedula) {
        return null;
    }

    @Override
    public List<CiudadanoDTO> traerCiudadanos() {
        return List.of();
    }

    @Override
    public CiudadanoDTO editarCiudadano(int cedula, CiudadanoDTO ciudadanoDTO) {
        return null;
    }

    @Override
    public String eliminarCiudadano(int cedula) {
        return "";
    }
}
