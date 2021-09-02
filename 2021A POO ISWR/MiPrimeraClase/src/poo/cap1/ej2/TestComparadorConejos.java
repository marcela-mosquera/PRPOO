/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

/**
 *
 * @author User
 */
public class TestComparadorConejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conejo conejo1 = new Conejo(1, 4.6, 10, "Jaq");
        Conejo conejo2 = new Conejo(1, 4.6, 10, "Jaq");
        Conejo conejo3 = new Conejo(2, 2.7, 15, "Lola");
        
        if(conejo1.equals(conejo2)){
            System.out.println("Los conejos son iguales");
        }
        else{
            System.out.println("Los conejos son diferentes");
        }
        
        //Quiero saber si conejo2 y conejo3 tienen sl mismo nombre
        if(conejo2.getNombre().equalsIgnoreCase(conejo3.getNombre()))
        System.out.println("Los nombres son iguales");
        else{
        System.out.println("Los nombres son diferentes");
        }
        
        //Para llamar al metodo diagnosticar conejo necesitamos un obj de la clase Veterinario
        Veterinario veterinario = new Veterinario();
        String resultado = veterinario.diagnosticarConejo(conejo1.getEdad(), conejo1.getPeso());
        System.out.println("El diagnostico del conejo 1 es: " + resultado);
        
        String resultado2 = veterinario.diagnosticarConejo(conejo3);
        System.out.println("El diagnostico del conejo3 es: " + resultado2);

           }
    
}
