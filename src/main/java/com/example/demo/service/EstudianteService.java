package com.example.demo.service;

import com.example.demo.model.Estudiante;

public interface EstudianteService {
    Estudiante newEstudiante(Estudiante newEstudiante);
    Iterable<Estudiante> getAll();
    Estudiante modifyEstudiante(Estudiante estudiante);
    Boolean deleteEstudiante(Integer idEstudiante);
}
