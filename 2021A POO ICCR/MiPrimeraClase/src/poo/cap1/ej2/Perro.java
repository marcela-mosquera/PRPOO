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
public class Perro extends Mascota {
    public String raza;
    
    public Perro(String raza, String nombre, char sexo){
        //1 er escenario llamar al constructor de la clase Padre que recibe args
        super(nombre, sexo);
        //luego realizar la asignacion de las variables especificas
        this.raza = raza;
        
        //2do escenario en donde no hay constructores
       /* this.raza = raza;
        this.nombre = nombre;
        this.setSexo(sexo);*/
    }
    
    public Perro (){
        
    }
    
    @Override
    public String toString(){
        return this.nombre+" "+this.raza+" "+this.getSexo();
    }
    
    //sobreescribir el metodo saludar definido en la clase Mascota
    //el nuevo mensaje sera PERRITO SALUDANDO
    @Override
    public String saludar(){
        return super.saludar()+" PERRITO SALUDANDO";
    }
    

    /*
    Al sobreescribir un metodo el modificador de acceso PUEDE CAMBIAR
    por uno menos restrictivo
    */
    public String emitirSonido(){
        return "GUAU GUAU GUAU";
    }
    
    /* no se puede sobreescribir el metodo debido a que esta indicado
    como final en la clase Mascota
    public String presentarInformacion(){
        return this.nombre+" "+this.getSexo()+" "+this.raza;
    }
   */
    
    @Override
    public char mostrarInicial(){
        return 'F';
    }

    public String getRaza() {
        return raza;
    }
    

    
    
}
