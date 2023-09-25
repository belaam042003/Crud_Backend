package com.example.demo.service;

import com.example.demo.model.Profesor;

public interface ProfesorService {

    Profesor newProfesor(Profesor newProfesor);
    Iterable<Profesor> getAll();
    Profesor modifyProfesor(Profesor profesor);
    Boolean deleteProfesor(Integer idProfesor);
}
