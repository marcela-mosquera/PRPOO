/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

/**
 *
 * @author FAMILIA Cach
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correoElectronico;

    public Persona(String nombre, String apellido, String cedula, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public static boolean validarCorreoGmail(String cood){
        //Validar codigos de 5 digitos
        return cood.matches("^[a-z|0-9|A-Z|_]{2,15}[@][g][m][a][i][l][.][c][o][m]{1}$");
    }
    public static boolean validarCorreoHotmailCOM(String cood){
        //Validar codigos de 5 digitos
        return cood.matches("^[a-z|0-9|A-Z|_]{2,15}[@][h][o][t][m][a][i][l][.][c][o][m]{1}$");
    }
    public static boolean validarCorreoHotmailES(String cood){
        //Validar codigos de 5 digitos
        return cood.matches("^[a-z|0-9|A-Z|_]{2,15}[@][h][o][t][m][a][i][l][.][e][s]{1}$");
    }
    public static boolean validarCorreoInstitucional(String cood){
        //Validar codigos de 5 digitos
        return cood.matches("^[a-z]{3,}[.]{1}[a-z]{3,}[0-9]?[0-9]?[@]{1}[a-z]{2,6}[.][e][d][u][.][e][c]{1}$");
    } 
    public static boolean validacionCedula(String x){
       
        int suma=0;
        
        if(x!=null){
        if(x.length()!=10){
            System.out.println("Cedula invalida");
            return false;
        }else{
             
            int a[]=new int [x.length()/2];
            int b[]=new int [(x.length()/2)];
            int c=0;
            int d=1;
           
            for (int i = 0; i < x.length()/2; i++) {
                a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
                c=c+2;
                if (i < (x.length()/2)-1) {
                    b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
                    d=d+2;
                }
            }
            for (int i = 0; i < a.length; i++) {
                a[i]=a[i]*2;
           
                if (a[i] >9){
                    a[i]=a[i]-9;
                }
                suma=suma+a[i]+b[i];
            }
            int aux=suma/10;
            int dec=(aux+1)*10;
           
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1)))){
                System.out.println("Numero de cedula correcto");
                return true;
            }else{
               
                if(suma%10==0 && x.charAt(x.length()-1)=='0'){
                   
                    return true;
                }else{
                    System.out.println("Numero de cedula incorrecto");
                    return false;
                }
            }
           
        }  
       
     }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", \napellido=" + apellido + ", \ncedula=" + cedula + ", \ncorreoElectronico=" + correoElectronico+"\n" + '}';
    }
}
