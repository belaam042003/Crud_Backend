package com.estudiante.estudiante.service;
import com.estudiante.estudiante.model.Estudiante;

public interface EstudianteService {
    Estudiante newEstudiante(Estudiante newEstudiante);
    Iterable<Estudiante> getAll();
    Estudiante modifyEstudiante(Estudiante estudiante);
    Boolean deleteEstudiante(Integer idEstudiante);
}
