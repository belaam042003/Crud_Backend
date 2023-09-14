package com.example.demoarq.repos;

import com.example.demoarq.model.Materia;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

public interface MateriaRepository extends JpaRepository<Materia,Long> {
}
