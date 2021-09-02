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
public class Gato extends Mascota {

    public Gato(String nombre, char sexo) {
        super(nombre, sexo);
    }

    public Gato() {

    }

    //el metodo se puede sobreescribir MANTENIENDO el mismo modificador de acceso
    @Override
    protected String emitirSonido() {
        return "Miau miau miau";
    }
    
    
}
