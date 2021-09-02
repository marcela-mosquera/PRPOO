package com.paa.modelo;

import java.util.ArrayList;


public class Docente extends Persona {
    private String presentacion;
    private int celular;
    private ArrayList<Curso> cursos;

    public Docente(String presentacion, int celular, String nombre, String apellido, String cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
        this.presentacion = presentacion;
        this.celular = celular;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c){
        this.cursos.add(c);
    }
    
}
