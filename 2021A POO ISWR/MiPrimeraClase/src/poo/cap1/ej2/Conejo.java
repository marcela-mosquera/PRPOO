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
public class Conejo extends Animal implements Comparable<Conejo> {

    private String nombre;
    private int edad; //edad en dias
    private double peso;
    private double tasaCrecimientoPorcentual;
    private double factor;
    private String raza;
    private String sexo;
    private String dieta;
    private String[] alimentosFavoritos;
    private String[] descripcion;
    private final int identificador;//variable de instancia que no puede ser modificada: final
    private static int edadConejoAdulto = 25;//variable de clase static toma el valor de 25
    private static int contadorConejos;//

    //constructores
    //Primer constructor con peso del conejo y la tasa de crecimiento porcentual
    public Conejo(double peso, double tasaCrecimiento, int identificador) {
        this.peso = peso;
        this.tasaCrecimientoPorcentual = tasaCrecimiento;
        this.identificador = identificador;
        contadorConejos++;
    }

    //Segundo constructor: constructor vacio
    public Conejo() {
        System.out.println("Constructor vacio de la clase conejo");
        this.identificador = 001;
    }

    //Tercer constructor con la tasa de creimiento porcentual y la edad
    public Conejo(double tasaCrecimiento, int edad, int identificador) {
        this.tasaCrecimientoPorcentual = tasaCrecimiento;
        this.edad = edad;
        this.identificador = identificador;
        contadorConejos++;
    }

    //Cuarto constructor con la edad y la tasa de crecimiento
    public Conejo(int edad, double tasaCrecimiento, int identificador) {
        this.edad = edad;
        this.tasaCrecimientoPorcentual = tasaCrecimiento;
        this.identificador = identificador;
        contadorConejos++;
    }

    //Colocar un constructor que recibe las 4 variables de instancia
    public Conejo(int edad, double peso, double tasa, String nombre, int identificador) {
        this.edad = edad;
        this.peso = peso;
        this.tasaCrecimientoPorcentual = tasa;
        this.nombre = nombre;
        this.identificador = identificador;
        contadorConejos++;
    }

    public Conejo(int edad, double peso, double tasa, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.tasaCrecimientoPorcentual = tasa;
        this.nombre = nombre;
        this.identificador = 001;
        contadorConejos++;
    }

    /*en este bloque estamos inicializando a valores por default acorde a 
    las reglas delnegocio*/
    {
        //System.out.println("Bloque A");
        peso = 14.5;
        tasaCrecimientoPorcentual = 10;
    }

    //get y set
    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    public double getTasaCrecimientoPorcentual() {
        return tasaCrecimientoPorcentual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String[] getAlimentosFavoritos() {
        return this.alimentosFavoritos;
    }

    public void setAlimentosFavoritos(String[] alimentos) {
        this.alimentosFavoritos = alimentos;
    }

    public String[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }

    //metodos
    public void crecer() {
        this.edad++;
        this.peso = peso + ((tasaCrecimientoPorcentual * peso) / 100);
    }

    public void crecer(int dias) {

    }

    public String desplegarInformacion() {
        return " Nombre " + this.nombre + " edad " + this.edad + " peso " + this.peso;
    }

    public boolean esAdulto() {
        return this.edad > 99;
    }

    //sobreescritura
    @Override
    public String toString() {
        return this.identificador + "-Nombre " + this.nombre + " Edad " + this.edad + " Peso " + this.peso
                + " Tasa crecimiento porcentual " + this.tasaCrecimientoPorcentual
                + " Raza " + this.raza + " Sexo " + this.sexo + " Dieta " + this.dieta;
    }

    //Un metodo para comparar un conejo con otro
    //Dos conejos son iguales si tienen la misma edad y el mismo peso
    public boolean equals(Conejo otroConejo) {
        return this.edad == otroConejo.getEdad() && this.peso == otroConejo.getPeso();
    }

    public String mostrarAlimentosFavoritos() {
        String resultado = "";
        for (String alimento : alimentosFavoritos) {
            if (alimento != null) {
                resultado += alimento + " ";
            }
        }
        return resultado;
    }

    public String mostrarCaracteristicas() {
        String resultado = "";
        for (String alimento : descripcion) {
            resultado += alimento + "***";
        }
        return resultado;
    }

    public static int getEdadConejoAdulto() {
        return edadConejoAdulto;
    }

    public static void setEdadConejoAdulto(int edadConejoAdulto) {
        Conejo.edadConejoAdulto = edadConejoAdulto;
    }

    public static int getContadorConejos() {
        return contadorConejos;
    }

    public static void setContadorConejos(int contadorConejos) {
        Conejo.contadorConejos = contadorConejos;
    }

    @Override
    public String mostrarAlimentoFavorito() {
        return "Alfalfa";
    }

    @Override
    public int compareTo(Conejo otroConejo) {
        //-1 si la edad del conejo actual < edad otroConejo
        //0 si las edades son iguales
        //+1 si la edad del conejo actual > edad otroConejo
        int resultado = 0;
        if(this.edad > otroConejo.getEdad())
            resultado = 1;
        if(this.edad < otroConejo.getEdad())
            resultado = -1;
        return resultado;
    }

}
