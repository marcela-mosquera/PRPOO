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
    
    public Gato (String nombre, char sexo){
        super (nombre, sexo);
    }
    
    public Gato ( ){
        
    }
    
    /*
    En la sobreescritura se puede mantener el modificador de acceso
    del metodo
    */
    protected String emitirSonido(){
        return "miau miau miau";
    }


    
    
}
