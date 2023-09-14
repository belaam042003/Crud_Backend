package com.example.demoarq.controllers;

import com.example.demoarq.model.Profesores;
import com.example.demoarq.repos.ProfesoresRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// @RequestMapping("/api/Libro")
// public class MateriaController {

//     @Autowired
//     private LibroService libroService;

//     @GetMapping("/all")
//     public List<Materia>getAll(){
//         return libroService.getAll();
//     }

// }


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class ProfesoresController {

    @Autowired
    private ProfesoresRepository materiaRepository;

    @GetMapping
    public List<Profesores> listarMaterias() {
        return materiaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Profesores obtenerMateriaPorId(@PathVariable Long id) {
        return materiaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Profesores crearMateria(@RequestBody Profesores materia) {
        return materiaRepository.save(materia);
    }

    @PutMapping("/{id}")
    public Profesores actualizarMateria(@PathVariable Long id, @RequestBody Profesores materiaActualizada) {
        Profesores materiaExistente = materiaRepository.findById(id).orElse(null);
        if (materiaExistente != null) {
            materiaExistente.setNombre(materiaActualizada.getNombre());
            materiaExistente.setCreditos(materiaActualizada.getCreditos());
            materiaExistente.setIntensidadHoraria(materiaActualizada.getIntensidadHoraria());
            return materiaRepository.save(materiaExistente);
        } else {
            return null; // Manejo de error si la materia no existe
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarMateria(@PathVariable Long id) {
        materiaRepository.deleteById(id);
    }
}