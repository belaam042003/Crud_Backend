package com.example.demoarq.controllers;

import com.example.demoarq.model.Libro;
import com.example.demoarq.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/all")
    public List<Libro>getAll(){
        return libroService.getAll();
    }

}
