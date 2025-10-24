package TP8_2_Excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Hernán E. Bula
 *
* Parte 2: Ejercicios sobre Excepciones 
* 3. Lectura de archivo 
* ○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
 *
 */
public class Main3LecturaArchivo {

    public static void main(String[] args) {

        VisorArchivo txt = new VisorArchivo();
        try {
            txt.mostrarArchivo("src/TP8_2_Excepciones/TxtEjemplo.txt"); // 
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe.");
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida.");
            System.out.println(ex.getMessage());
        }
    }
}
