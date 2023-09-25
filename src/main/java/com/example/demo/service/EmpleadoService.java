package com.example.demo.service;
import com.example.demo.model.Empleado;

public interface EmpleadoService {
    Empleado newEmpleado(Empleado newEmpleado);
    Iterable<Empleado> getAll();
    Empleado modifyEmpleado(Empleado empleado);
    Boolean deleteEmpleado(Integer idEmpleado);
}
