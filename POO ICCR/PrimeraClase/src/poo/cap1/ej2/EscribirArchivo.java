/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author Marcela
 */
public class EscribirArchivo {

    private Formatter salida; //objeto usado para enviar texto al archivo

    //permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("ratones.txt");
        } catch (SecurityException securityException) {
            System.err.println("No tiene acceso de escritura a este archivo");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo");
            System.exit(1);
        }

    }

    //agrega registros al archivo
    public void agregarRegistros(Raton r) {
        // objeto que se va a escribir en el archivo;

        salida.format("%s %d %.2f\n", r.nombre, r.getEdad(), r.getPeso());

    } // fin del método agregarRegistros

    // cierra el file
    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
} // fin de la clase CrearArchivoTexto

