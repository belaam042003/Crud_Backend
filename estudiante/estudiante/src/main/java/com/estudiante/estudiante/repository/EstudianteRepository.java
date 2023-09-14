package com.estudiante.estudiante.repository;

import com.estudiante.estudiante.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
