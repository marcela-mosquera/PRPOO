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
public class Conejo extends Animal implements Comparable<Conejo> {

    //variables de instancia o de clase
    private int edad;
    private double peso;
    private double tasaCrecimientoPorcentual;
    private String nombre;
    private String raza;
    private String dieta;
    private String sexo;
    private String[] alimentosFavoritos; //declarando una variable de instancia de tipo arreglo de Strings
    private String[] descripcion;
    private final int IDENTIFICADOR; //variable de instancia cuyo valor no sera modificado posteriormente final
    private static final int EDAD_CONEJO_ADULTO = 30; //variable de clase (static) cuyo valor no sera modificado (final)
    private static int contadorConejosCreados; //variable de clase (static) que incrementara edn uno cada vez que se cree un conejo

    //constructores
    /*
    Crear un constructor para la clase Conejo, que reciba el peso del conejo y
    la tasa de crecimiento porcentual.
     */
    public Conejo(int numero) {
        System.out.println("Constructor vacio");
        this.IDENTIFICADOR = numero;
        contadorConejosCreados++;
    }

    public Conejo() {
        this.IDENTIFICADOR = 1;
    }

    { //valores por default acorde a las reglas del negocio
        this.peso = 15.5;
        this.nombre = "desconocido";
        this.tasaCrecimientoPorcentual = 10;
    }

    public Conejo(double peso, double tasaCrecimiento, int numero) {
        this.peso = peso;
        this.tasaCrecimientoPorcentual = tasaCrecimiento;
        int edad;
        this.IDENTIFICADOR = numero;
        contadorConejosCreados++;
    }

    {
        System.out.println("Bloque B");
    }

    //Constructor que reciba la tasa de crecimiento porcentual y la edad?
    public Conejo(double tasaCrecimiento, int edad, int numero) {
        this.tasaCrecimientoPorcentual = tasaCrecimiento;
        this.edad = edad;
        this.IDENTIFICADOR = numero;
        contadorConejosCreados++;
    }

    public Conejo(int edad, double tasaCrecimiento, int numero) {
        this.IDENTIFICADOR = numero;
        contadorConejosCreados++;

    }

    public Conejo(int edad, double tasaCrecimiento, double peso, String nombre, int numero) {
        if (edad > 0) {
            this.edad = edad;
        }
        if (tasaCrecimiento > 0) {
            this.tasaCrecimientoPorcentual = tasaCrecimiento;
        }
        if (peso > 0) {
            this.peso = peso;
        }
        this.nombre = nombre;
        this.IDENTIFICADOR = numero;
        contadorConejosCreados++;
    }
    //get y set

    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return alimentosFavoritos;
    }

    public double getTasaCrecimientoPorcentual() {
        return tasaCrecimientoPorcentual;
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

    //otros metodos
    /*
        El método crecer simula el aumento de peso y edad 
        en un día para un conejo. 
     */
    public void crecer() {
        this.edad++;
        this.peso = this.peso + this.tasaCrecimientoPorcentual / 100 * this.peso;

    }

    public void crecer(int dias) {
        //   this.edad+=dias;
        for (int i = 0; i < dias; i++) {
            //this.edad++;
            crecer();
        }
    }


    /*El método desplegarInformacion retorna un String con el nombre, la edad 
    y peso del conejo*/
    public String desplegarInformacion() {
        return "Nombre " + this.nombre + " edad " + this.edad + " peso " + this.peso;
    }

    public boolean esAdulto() {
        return (this.edad > 99);
    }

    @Override
    public String toString() {
        return this.IDENTIFICADOR + " Nombre " + this.nombre + " edad " + this.edad + " peso " + this.peso
                + " tasa crecimiento "
                + this.tasaCrecimientoPorcentual + " sexo " + this.sexo + " raza "
                + this.raza + " dieta " + this.dieta;
    }

    //crear un metodo que recorra todo el arreglo alimentosFavoritos, y presente 
    //el contenido de ese arreglo como un String con la consideracion
    //de que si el arreglo no esta completamente lleno, no se debe mostrar el texto null
    public String mostrarAlimentosFavoritos() {
        String resultado = "";
        // Arrays.sort(alimentosFavoritos);
        /*  for(int i=0; i<this.alimentosFavoritos.length; i++){
            if(alimentosFavoritos[i]!= null)
            resultado+=alimentosFavoritos[i]+" ";
        }*/

        //utilizar una instruccion for mejorada foreach
        for (String item : alimentosFavoritos) {
            if (item != null) {
                resultado += item + " ";
            }
        }
        return resultado;
    }

    public static int getEDAD_CONEJO_ADULTO() {
        return EDAD_CONEJO_ADULTO;
    }

    public static int getContadorConejosCreados() {
        return contadorConejosCreados;
    }

    public String verComidaFavorita() {
        return "alfalfa";
    }

    @Override
    //implementando el ORDEN NATURAL en base a la edad del conejo
    public int compareTo(Conejo otroConejo) {

        if (this.edad < otroConejo.getEdad()) {
            return -1;
        } else if (this.edad > otroConejo.getEdad()) {
            return 1;
        }

        return 0;
    }

}
