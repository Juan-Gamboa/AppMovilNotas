package com.example.myapplicationnotaspromedio.modals;

import java.io.Serializable;

public class InfoUsuario implements Serializable {

    private String nombre;
    private String asignatura;

    public InfoUsuario() {
        this.nombre = nombre;
        this.asignatura = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
