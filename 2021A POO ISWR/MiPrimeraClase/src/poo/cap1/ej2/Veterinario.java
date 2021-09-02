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
public class Veterinario {
    
    private String correoElectronico;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
    public String diagnosticarConejo(int edad, double peso){
        /*
        Obtener la relacion edad / peso y evaluacion. Si ese valor
        es menor a 0,25 el veterinario indica que "el conejo debe comer
        mas" caso contrario "el conejo esta en perfectas condiciones"
        */
        double relacionEdadPeso = edad / peso;
        if(relacionEdadPeso < 0.25)
            return "El conejo debe comer mas";
        else
            return "El conejo esta en perfectas condiciones";
    }        

    public String diagnosticarConejo(Conejo conejoPaciente){
        double relacionEdadPeso = conejoPaciente.getPeso() /
                conejoPaciente.getEdad();
        conejoPaciente.setFactor(relacionEdadPeso);
        if(relacionEdadPeso < 0.25)
            return "El conejo debe comer mas";
        else
            return "El conejo esta en perfectas condiciones";    
    }    
    

}
