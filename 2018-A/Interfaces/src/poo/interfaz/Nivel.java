/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

import java.util.LinkedList;

/**
 *
 * @author FAMILIA Cach
 */
public class Nivel {
    private String nombre;
    private LinkedList<String> requisitosGenerales;

    public Nivel(String nombre, LinkedList<String> requisitosGenerales) {
        this.nombre = nombre;
        this.requisitosGenerales = requisitosGenerales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getRequisitosGenerales() {
        return requisitosGenerales;
    }

    public void setRequisitosGenerales(LinkedList<String> requisitosGenerales) {
        this.requisitosGenerales = requisitosGenerales;
    }

    @Override
    public String toString() {
        return "Nivel{" + "nombre=" + nombre + ", \nrequisitosGenerales=" + requisitosGenerales +"\n"+ '}';
    }
}
