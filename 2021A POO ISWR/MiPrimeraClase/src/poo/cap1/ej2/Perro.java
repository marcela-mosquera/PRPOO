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
//establecer una relacion de herencia entre la clase Perro (subclase)
//y la clase Mascota (superclase)
public class Perro extends Mascota {

    private String raza;

    //primera forma de crear un objeto de la subclase
    public Perro(String raza, String nombre, char sexo) {
        //llamar al constructor con datos disponible en la clase superclase
        super(nombre, sexo);
        //asigno los valores especificos de las variables de la subclase
        this.raza = raza;
    }

    //segunda forma
    public Perro(String raza, char sexo, String nombre) {
        //llamar al constructor vacio en la clase superclase
        //asigno los valores especificos para todas las variables
        //nombre tiene modificador de acceso protected y se accede directamente
        this.nombre = nombre;
        //sexo tiene modificador de acceso private y puedo utilizar un 
        //setSexo para asignar el valor
        this.setSexo(sexo);
        this.raza = raza;
    }

    public Perro() {

    }

    @Override
    public String toString() {
        //necesito presentar el valor de las 3 variables de instancia
        return super.toString() + " - " + this.raza;
    }

    @Override
    public String saludar() {
        return "PERRITO SALUDANDO";
    }

    /*El metodo se puede sobreescribir con un modificador de acceso 
    mas permisivo*/
    @Override
    public String emitirSonido() {
        return "GUAU GUAU GUAU";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    

}
