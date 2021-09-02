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
public class Veterinario {
    
    private String correoElectronico;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    
    /*
        Obtener la relación edad / peso y evaluarlo. 
    Si ese valor es menor a 0,25 el veterinario indica que "el conejo debe comer
         más" caso contrario "el conejo está en perfectas condiciones"
     */
    public String diagnosticar(String nombre, int edad, double peso) {
        // implementar la logica
        double relacionEdadPeso = edad / peso;
        String diagnostico="El diagnóstico de "+nombre+" es ";
        if(relacionEdadPeso<0.25)
            diagnostico+=" el conejo debe comer más";
        else
            diagnostico+=" el conejo está en perfectas condiciones";
        
        return diagnostico;

    }

}
