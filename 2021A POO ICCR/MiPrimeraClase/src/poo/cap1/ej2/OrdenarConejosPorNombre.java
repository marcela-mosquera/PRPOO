/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.Comparator;

/**
 *
 * @author Marcela
 */
//Clase es usada para implementar el orden total segun el nombre para obj de la clase Conejo
public class OrdenarConejosPorNombre implements Comparator<Conejo>{
    @Override
    public int compare(Conejo c1, Conejo c2){
        return c1.getNombre().compareTo(c2.getNombre());
        
    }
}
