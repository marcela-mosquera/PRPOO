/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import javax.swing.JOptionPane;

/**
 *
    * @author User
 */
public class TestCuadrosDeDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cuadro de dialogo para mostrar un mensaje
        //JOptionPane.showMessageDialog(null, "Buenos dias", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        
        //Cuadro de texto para solicitar datos
        String edadStr = JOptionPane.showInputDialog(null, "Ingrese la edad");
        String tasaCrecimientoStr = JOptionPane.showInputDialog(null, "Ingrese la tasa de crecimiento");
        
        Conejo miConejo = new Conejo(Integer.parseInt(edadStr), Double.parseDouble(tasaCrecimientoStr),4);
        
        JOptionPane.showMessageDialog(null, miConejo.toString(), "Datos", JOptionPane.INFORMATION_MESSAGE);
        
        //Cuadro de dialogo para preguntarle al USR si desea simular el crecimiento e un dia del conejo
        
        int opcionseleccionada = JOptionPane.showConfirmDialog(null, "Desea simular el crecimiento en un dia", "Pregunta", JOptionPane.YES_NO_CANCEL_OPTION);
        //NO 1
        //SI 0
        //Utilizar una sentencia selectiva para ejecutar el metodo crecer() y luego mostrar la info conejo en otro cuadro de dialogo
        if(opcionseleccionada == 0){
            miConejo.crecer();
            JOptionPane.showMessageDialog(null, miConejo.toString());
        }
    }
    
}
