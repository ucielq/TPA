package com.example.demo.entities;

import com.example.demo.entities.Base;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

@Table(name = "alumno")
public class Alumno extends Base {

    @Column(name = "legajo")
    private int legajo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "curso")
    private String curso;
}

