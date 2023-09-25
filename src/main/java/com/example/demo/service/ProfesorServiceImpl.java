package com.example.demo.service;

import com.example.demo.model.Profesor;
import com.example.demo.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorService{

    @Autowired
    private ProfesorRepository profesorRepsoitory;
    @Override
    public Profesor newProfesor(Profesor newProfesor) {
        return profesorRepsoitory.save(newProfesor);
    }

    @Override
    public Iterable<Profesor> getAll() {
        return this.profesorRepsoitory.findAll();
    }

    @Override
    public Profesor modifyProfesor(Profesor profesor) {
        Optional<Profesor> profesorEncontrado=this.profesorRepsoitory.findById(profesor.getIdentificacion());
        if(profesorEncontrado.get() != null){
            profesorEncontrado.get().setFoto(profesor.getFoto());
            profesorEncontrado.get().setNombre(profesor.getNombre());
            profesorEncontrado.get().setEdad(profesor.getEdad());
            profesorEncontrado.get().setTitulo(profesor.getTitulo());
            this.newProfesor(profesorEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deleteProfesor(Integer idProfesor) {
        this.profesorRepsoitory.deleteById(idProfesor);
        return true;
    }
}
