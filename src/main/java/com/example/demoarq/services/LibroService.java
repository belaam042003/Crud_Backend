package com.example.demoarq.services;

import com.example.demoarq.model.Profesores;
import com.example.demoarq.repos.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private ProfesoresRepository profesoresRepository;

    public List<Profesores> getAll(){
        return profesoresRepository.getAll();
    }
}
