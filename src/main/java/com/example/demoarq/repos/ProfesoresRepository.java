package com.example.demoarq.repos;

import com.example.demoarq.model.Profesores;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

public interface ProfesoresRepository extends JpaRepository<Profesores,Long> {
}
