package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class EstudianteController {

    @GetMapping("/lala")
    public String es(){
        return "index";
    }

    @Autowired
    private EstudianteService estudianteService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevo")
    public Estudiante newEstudiante(@RequestBody Estudiante newEstudiante){
        return this.estudianteService.newEstudiante(newEstudiante);
    }

    @GetMapping("/mostrar")
    public Iterable<Estudiante> getAll(){
        return estudianteService.getAll();
    }

    @PostMapping("/modificar")
    public Estudiante updateEstudiante(@RequestBody Estudiante estudiante){
        return this.estudianteService.modifyEstudiante(estudiante);
    }

    @PostMapping(value ="/{id}")
    public Boolean deleteEstudiante(@PathVariable(value = "id") Integer id){
        return this.estudianteService.deleteEstudiante(id);
    }
}
