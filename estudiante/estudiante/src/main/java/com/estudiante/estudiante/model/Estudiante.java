package com.estudiante.estudiante.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class Estudiante {
    @Id
    @Column
    private Integer identificacion;
    @Column
    private String foto;
    @Column
    private String nombre;
    @Column
    private String edad;
    @Column
    private String grado;

}
