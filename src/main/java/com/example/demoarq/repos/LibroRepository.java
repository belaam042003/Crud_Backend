package com.example.demoarq.repos;

import com.example.demoarq.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibroRepository {
    @Autowired
    private LibroCRUDRepository libroCRUDRepository;


    public List<Libro> getAll(){
        return (List<Libro>) libroCRUDRepository.findAll();
    }
}
