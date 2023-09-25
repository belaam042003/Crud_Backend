package com.example.demo.service;


import com.example.demo.model.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepsoitory;
    @Override
    public Empleado newEmpleado(Empleado newEmpleado) {
        return empleadoRepsoitory.save(newEmpleado);
    }

    @Override
    public Iterable<Empleado> getAll() {
        return this.empleadoRepsoitory.findAll();
    }

    @Override
    public Empleado modifyEmpleado(Empleado empleado) {
        Optional<Empleado> empleadoEncontrado=this.empleadoRepsoitory.findById(empleado.getIdentificacion());
        if(empleadoEncontrado.get() != null){
            empleadoEncontrado.get().setFoto(empleado.getFoto());
            empleadoEncontrado.get().setNombre(empleado.getNombre());
            empleadoEncontrado.get().setEdad(empleado.getEdad());
            empleadoEncontrado.get().setGrado(empleado.getGrado());
            this.newEmpleado(empleadoEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deleteEmpleado(Integer idEmpleado) {
        this.empleadoRepsoitory.deleteById(idEmpleado);
        return true;
    }
    
}
