/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.examenib.poo;

/**
 *
 * @author Marcela
 */
public class Seguro {
    private int identificador;
    private double montoMaximo;
    private char tipoSeguro; //A - B
    private double porcentajeCobertura; //15 o 35 %

    public Seguro(int identificador, double montoMaximo, char tipoSeguro, double porcentajeCobertura) {
        this.identificador = identificador;
        this.montoMaximo = montoMaximo;
        this.tipoSeguro = tipoSeguro;
        this.porcentajeCobertura = porcentajeCobertura;
    }

    public Seguro(int numeroPersonas, double valorAPagar, int identificador) {
        this.identificador = identificador;
        if (numeroPersonas >20)
            this.tipoSeguro = 'A';
        else
            this.tipoSeguro='B';
        if (valorAPagar > 600 ){
            this.porcentajeCobertura = 0.35;
            this.montoMaximo = this.porcentajeCobertura * valorAPagar;
        }
        else {
            this.porcentajeCobertura = 0.15;
            this.montoMaximo = this.porcentajeCobertura * valorAPagar;
        }
        //UNA SOLA VEZ 
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public char getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(char tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public double getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    public void setPorcentajeCobertura(double porcentajeCobertura) {
        this.porcentajeCobertura = porcentajeCobertura;
    }
    
    
    
    
}
