package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Profesor {
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
    private String titulo;

}