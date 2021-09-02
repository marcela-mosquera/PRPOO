/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paa.utilidades;

/**
 *
 * @author Marcela
 */
public class Validador {

    //crear un metodo que recibe un String y verifica si ese String 
    //es un correo electronico institucional
    public static boolean verificarCorreoElectronico(String correo) {
        return correo.matches("^[a-z]+\\.[a-z]+\\d*@epn\\.edu\\.ec$");

    }

    public static boolean verificarNombre(String nombre) {
        return nombre.matches("^[a-zA-ZñÑ]+$");
    }

    public static boolean verificarCedula(String cedula) {
        return cedula.matches("^[0-9]{10}$");
    }
}
