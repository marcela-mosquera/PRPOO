/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marcela
 */
public class TestValidaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un obj de la clase veterinario
        Veterinario vet = new Veterinario();
        //colocar un correo electronico al veterinario creado
        vet.setCorreoElectronico("lola87.mora@epn.edu.ec");
        //usar la clase Validador para saber si el correo cumple el formato o no
        boolean resultadoValidarCorreo = Validador.validarCorreoInstitucional(vet.getCorreoElectronico()); //boolean
        System.out.println("El correo es valido? "+resultadoValidarCorreo);
        
        //2 usar la clase Pattern y Matcher para buscar concordancias dentro de una cadena
        Pattern expresion = Pattern.compile("D.*1[0-2]-\\d\\d-7\\d");
        //Busca un cadena que inicie con D
        //la cadena puede tener cualquier otro caracter de 0 a n veces
        //seguido de un 1
        //seguido exclusivamente de: un 0 O un 1 O un 2
        //seguido de un guion
        //seguido de un digito - 0 al 9
        //seguido de un digito - 0 al 9
        //seguido de un guion
        //seguido de un 7
        //seguido de un digito 0 al 9
        
        //cadena1 contiene el registro de nombres de personas con su fecha de 
        //nacimiento en formato MM-DD-YYYY
        String cadena1 = "Jane 12-12-75\n" 
                + "Dave 11-04-90\n"
                + "John 04-28-90\n"
                + "Joe 12-17-77\n"
                + "Diana 10-04-70\n";
        
        Matcher matcher = expresion.matcher(cadena1);
        
        System.out.println("Los registros que coinciden con D.*1[0-2]-\\d\\d-7\\d son ");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        
        Pattern expresion2 = Pattern.compile("(D|J).*1[0-2]-\\d\\d-7\\d");
        //Busca un cadena que inicie con D O con J
        //la cadena puede tener cualquier otro caracter de 0 a n veces
        //seguido de un 1
        //seguido exclusivamente de: un 0 O un 1 O un 2
        //seguido de un guion
        //seguido de un digito - 0 al 9
        //seguido de un digito - 0 al 9
        //seguido de un guion
        //seguido de un 7
        //seguido de un digito 0 al 9
        Matcher matcher2 = expresion2.matcher(cadena1);
        System.out.println("Los registros que coinciden con (D|J).*1[0-2]-\\d\\d-7\\d");
        while (matcher2.find()){
            System.out.println(matcher2.group());
        }
    }
    
}
