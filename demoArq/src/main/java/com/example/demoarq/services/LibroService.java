package com.example.demoarq.services;

import com.example.demoarq.model.Materia;
import com.example.demoarq.repos.MateriaRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private MateriaRepository1 libroRepository;

    public List<Materia> getAll(){
        return libroRepository.getAll();
    }
}
