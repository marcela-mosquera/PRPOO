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
public abstract class Mascota extends Animal{

    protected String nombre;
    private char sexo; //posibles valores H, M

    public Mascota(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    public Mascota(){
        
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String saludar() {
        return "Mascota saludando";
    }

    public final String presentarInformacion() {
        return this.nombre + " " + this.sexo;
    }

    public char mostrarInicial() {
        //retorna la primera letra del nombre de la mascota
        return this.nombre.charAt(0);
    }
    
    protected abstract String emitirSonido();
    
    @Override
    public String verComidaFavorita(){
       return "croquetas";
    }


}
