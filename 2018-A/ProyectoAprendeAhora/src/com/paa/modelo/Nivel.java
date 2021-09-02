package com.paa.modelo;

import java.util.List;

public class Nivel {
    private String nombre;
    private List<String> requisitosGenerales;

    public Nivel(String nombre, List<String> registrosGenerales) {
        this.nombre = nombre;
        this.requisitosGenerales = registrosGenerales;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getRegistrosGenerales() {
        return requisitosGenerales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegistrosGenerales(List<String> registrosGenerales) {
        this.requisitosGenerales = registrosGenerales;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
