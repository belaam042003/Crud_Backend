package com.example.demoarq.repos;

import com.example.demoarq.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroCRUDRepository extends CrudRepository<Libro,Integer> {
}
