package com.example.demo.repository;

import com.example.demo.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MateriaRepository1 {
    @Autowired
    private MateriaRepository materiaCRUDRepository;


    public List<Materia> getAll(){
        return (List<Materia>) materiaCRUDRepository.findAll();
    }

}
