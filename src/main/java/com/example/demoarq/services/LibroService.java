package com.example.demoarq.services;

import com.example.demoarq.model.Libro;
import com.example.demoarq.repos.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getAll(){
        return libroRepository.getAll();
    }
}