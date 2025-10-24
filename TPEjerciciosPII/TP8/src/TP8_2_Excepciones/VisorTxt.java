
package TP8_2_Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Hernán E. Bula
 */

public class VisorTxt {
    
    public void mostrarTxt(String ruta) {
        File elArchivo = new File(ruta);
        try (BufferedReader br = new BufferedReader(new FileReader(elArchivo));) {
            System.out.println(br.readLine());   
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado: " + fnfe.getMessage());
        } catch (IOException ie) {
            System.out.println("Error de entrada / salida: " + ie.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
            
        }
    }
}
