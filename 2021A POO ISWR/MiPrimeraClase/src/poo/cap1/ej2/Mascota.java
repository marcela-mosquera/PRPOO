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
public abstract class Mascota extends Animal implements Comparable<Mascota> {

    protected String nombre;
    private char sexo; //posibles valores H y M

    public Mascota(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.sexo;
    }

    public String saludar() {
        return "Mascota saludando";
    }

    //al declarar un metodo con el modificador final, 
    //el metodo NO PUEDE ser sobreescrito en las subclases
    public final char mostrarInicial() {
        return this.nombre.charAt(0);
    }

    public String presentarInformacion() {
        return this.nombre + " - " + this.sexo;
    }

    protected abstract String emitirSonido();

    @Override
    public String mostrarAlimentoFavorito() {
        return "croquetas";
    }

    @Override
    public int compareTo(Mascota otraMascota){
        return this.nombre.compareTo(otraMascota.nombre);
    }

}
