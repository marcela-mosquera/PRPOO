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
public class Tour {

    private String tipoDeTour;
    private int numeroPersonas;
    private String servicios[];
    private String tipoTransporte;
    private double valorAPagar;
    //implementar agregacion con las clases Asesor y Cliente
    private Asesor asesor;
    private Cliente cliente;
    //implementar composicion con SEGURO
    private Seguro seguro;
    
    public Tour (){
        
    }

    public Tour(String tipoDeTour, int numeroPersonas, String[] servicios) {
        this.tipoDeTour = tipoDeTour;
        this.numeroPersonas = numeroPersonas;
        this.servicios = servicios;
    }

    public void asignarTransporte() {
        if (this.numeroPersonas <= 10) {
            this.tipoTransporte = "Buseta";
        } else {
            this.tipoTransporte = "Bus";
        }

    }

    public void calcularValorApagar() {
        int tarifaBase;
        int tipoDeTour;
        if (this.numeroPersonas <= 10) {
            tarifaBase = 150;
        } else {
            tarifaBase = 250;
        }
        if (this.tipoDeTour.equalsIgnoreCase("Día Completo")) {
            tipoDeTour = 50;
        } else {
            tipoDeTour = 30;
        }
        this.valorAPagar = tarifaBase + (this.servicios.length * 2.5 * this.numeroPersonas)
                + tipoDeTour;
    }

    public String getTipoDeTour() {
        return tipoDeTour;
    }

    public void setTipoDeTour(String tipoDeTour) {
        this.tipoDeTour = tipoDeTour;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

 

    public String getServicios() {
        String resultado="";
        for(String s: this.servicios)
            resultado+=s;
        return resultado;
    }

    public void setServicios(String[] servicios) {
        this.servicios = servicios;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    public void setAsesor (Asesor a1){
        this.asesor = a1;
    }
    
    public Asesor getAsesor(){
        return this.asesor;
    }
    
    public void setCliente (Cliente c){
        this.cliente = c;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setSeguro(Seguro s){
        this.seguro = s;
    }
    
    public Seguro getSeguro(){
        return this.seguro;
    }

}
