package com.example.demo.controller;

import com.example.demo.model.Profesor;
import com.example.demo.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profesor")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevo")
    public Profesor newProfesor(@RequestBody Profesor newProfesor){
        return this.profesorService.newProfesor(newProfesor);
    }

    @GetMapping("/mostrar")
    public Iterable<Profesor> getAll(){
        return profesorService.getAll();
    }

    @PostMapping("/modificar")
    public Profesor updateProfesor(@RequestBody Profesor profesor){
        return this.profesorService.modifyProfesor(profesor);
    }

    @PostMapping(value ="/{id}")
    public Boolean deleteProfesor(@PathVariable(value = "id") Integer id){
        return this.profesorService.deleteProfesor(id);
    }
}
