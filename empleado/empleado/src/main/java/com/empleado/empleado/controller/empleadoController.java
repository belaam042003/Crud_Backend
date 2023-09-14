package com.empleado.empleado.controller;


import com.empleado.empleado.model.Empleado;
import com.empleado.empleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class empleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevo")
    public Empleado newEmpleado(@RequestBody Empleado newEmpleado){
        return this.empleadoService.newEmpleado(newEmpleado);
    }

    @GetMapping("/mostrar")
    public Iterable<Empleado> getAll(){
        return empleadoService.getAll();
    }

    @PostMapping("/modificar")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.modifyEmpleado(empleado);
    }

    @PostMapping(value ="/{id}")
    public Boolean deleteEmpleado(@PathVariable(value = "id") Integer id){
        return this.empleadoService.deleteEmpleado(id);
    }
}
