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
public class MiPrimeraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conejo gus; //declaracin
        gus = new Conejo (); //Inicializando la variable
        gus.setTasaCrecimientoPorcentual(10);
        gus.setPeso(10);
        System.out.println("Info de gus: "+gus.desplegarInformacion());
        gus.setNombre("GUS");
        gus.crecer(); //llamada al metodo crecer
        System.out.println("Gus luego de crecer: "+gus.desplegarInformacion());
        System.out.println("Gus es adulto? " + gus.esAdulto());
        System.out.println("to String "+gus.toString());
        
        Conejo jag = new Conejo(14,10.6,7); //que constructor se ejecuta???
        
        
        /*Solicitar al usuario que ingrese el nombre, edad, peso, tasaCrecimientoPorcentual
        usando los metodos set respectivos van a asignar lo que ingresa el usuario
        a las variables de instancia de miConejo
        luego van a llamar al metodo miConejo.toString()
        
        Conejo miConejo = new Conejo();
        miConejo.ingresarDatosConejo();
        System.out.println("to String miConejo "+miConejo.toString());
*/
       
       Conejo pp = new Conejo();
       
       System.out.println("La informacion de pp sin actualizar"+pp.toString());
       pp.setPeso(-40); //agregar una condicion para que el metodo set actualice EL PESO UNICAMENTE SI ES UN VALOR PERMITIDO
       System.out.println("La informacion de pp "+pp.toString());
        
       
       String edadEnBinario =Integer.toBinaryString(jag.getEdad());
       
        System.out.println("La edad de Jag es "+jag.getEdad()+" y en binario es "+edadEnBinario);
    }

}
