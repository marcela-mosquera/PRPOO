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
public class Estudiante extends Persona{
    public Estudiante(String nombre, String apellido, String cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
    }

    @Override
    public String toString() {
        return super.toString()+", Estudiante{" +"\n"+ '}';
    }
}
