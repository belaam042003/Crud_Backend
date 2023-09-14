package com.estudiante.estudiante.service;


import com.estudiante.estudiante.model.Estudiante;
import com.estudiante.estudiante.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepsoitory;
    @Override
    public Estudiante newEstudiante(Estudiante newEstudiante) {
        return estudianteRepsoitory.save(newEstudiante);
    }

    @Override
    public Iterable<Estudiante> getAll() {
        return this.estudianteRepsoitory.findAll();
    }

    @Override
    public Estudiante modifyEstudiante(Estudiante estudiante) {
        Optional<Estudiante> estudianteEncontrado=this.estudianteRepsoitory.findById(estudiante.getIdentificacion());
        if(estudianteEncontrado.get() != null){
            estudianteEncontrado.get().setFoto(estudiante.getFoto());
            estudianteEncontrado.get().setNombre(estudiante.getNombre());
            estudianteEncontrado.get().setEdad(estudiante.getEdad());
            estudianteEncontrado.get().setGrado(estudiante.getGrado());
            this.newEstudiante(estudianteEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deleteEstudiante(Integer idEstudiante) {
        this.estudianteRepsoitory.deleteById(idEstudiante);
        return true;
    }
    
}
