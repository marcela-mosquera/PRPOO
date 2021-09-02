/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

/**
 *
 * @author FAMILIA Cach
 */
public class Docente extends Persona{
    private String presentacion;
    private int celular;
    private Curso curso;

    public Docente(String presentacion, int celular, String nombre, String apellido, String cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
        this.presentacion = presentacion;
        this.celular = celular;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    

    @Override
    public String toString() {
        return super.toString()+", Docente{" + "presentacion=" + presentacion + ", \ncelular=" + celular+"\n" + '}';
    }
}
