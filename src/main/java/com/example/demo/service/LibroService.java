package com.example.demo.service;

import com.example.demo.model.Materia;
import com.example.demo.repository.MateriaRepository1;
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
