/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcela
 */
public class TestCuadrosDeDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cuadro de dialogo para mostrar un mensaje
        //null indica que el cuadro de dialogo aparece centrado en la pantalla
        //entero que representa el tipo de ICONO -- son constantes de la clase JOptionPane
        //JOptionPane.showMessageDialog(null, "Buenas tardes", "SALUDO", JOptionPane.WARNING_MESSAGE);
        
        //cuadro de dialogo para solicitar informacion de edad y peso
        String edad = JOptionPane.showInputDialog(null, "Ingrese la edad", "EDAD", JOptionPane.QUESTION_MESSAGE);
        String peso = JOptionPane.showInputDialog(null, "Ingrese el peso", "PESO", JOptionPane.QUESTION_MESSAGE);
        
        Conejo miConejo = new Conejo (1); //todas las variables de instancia toman sus valores por default
        //utilizar los metodos set para asignar los valores de edad y peso a miConejo
        miConejo.setEdad(Integer.parseInt(edad));
        miConejo.setPeso(Double.parseDouble(peso));
        
        JOptionPane.showMessageDialog(null, miConejo.toString(), "DATOS", JOptionPane.INFORMATION_MESSAGE);
        
        //cuadro de dialogo para preguntarle al usr si desea simular el crecimiento del conejo
        int opcionSeleccionada = JOptionPane.showConfirmDialog(null, "Desea simular el crecimiento diario del conejo", "CONSULTA", JOptionPane.YES_NO_CANCEL_OPTION);
        //NO 1
        //SI 0
        /*Agregar una sentencia selectiva para ejecutar el metodo crecer si el usr selecciono SI como respuesta
        y utilizar un cuadro de dialogo de salida para mostrar la info del conejo
        */
        if (opcionSeleccionada == 0){
            miConejo.crecer();
            JOptionPane.showMessageDialog(null, miConejo.toString(), "DATOS LUEGO DE CRECER UN DIA", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
    
}
