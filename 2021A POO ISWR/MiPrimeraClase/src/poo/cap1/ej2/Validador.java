/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

/**
 *
 * @author Marcela
 */
public class Validador {

    public static boolean validarCorreoInstitucional(String correo) {
        return correo.matches("^[a-z]+\\.[a-z]+[0-9]*@epn\\.edu\\.ec$");
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("[A-Za-zñÑ]+");
    }

}
