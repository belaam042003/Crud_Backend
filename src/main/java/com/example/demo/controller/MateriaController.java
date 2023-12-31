package com.example.demo.controller;

import com.example.demo.model.Materia;
import com.example.demo.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping
    public List<Materia> listarMaterias() {
        return materiaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Materia obtenerMateriaPorId(@PathVariable Long id) {
        return materiaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Materia crearMateria(@RequestBody Materia materia) {
        return materiaRepository.save(materia);
    }

    @PutMapping("/{id}")
    public Materia actualizarMateria(@PathVariable Long id, @RequestBody Materia materiaActualizada) {
        Materia materiaExistente = materiaRepository.findById(id).orElse(null);
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