package com.empleado.empleado.service;
import com.empleado.empleado.model.Empleado;

public interface EmpleadoService {
    Empleado newEmpleado(Empleado newEmpleado);
    Iterable<Empleado> getAll();
    Empleado modifyEmpleado(Empleado empleado);
    Boolean deleteEmpleado(Integer idEmpleado);
}
