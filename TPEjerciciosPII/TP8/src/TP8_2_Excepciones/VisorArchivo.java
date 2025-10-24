
package TP8_2_Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Hernán E. Bula
 */

public class VisorArchivo {
    
    public void mostrarArchivo(String ruta) throws FileNotFoundException, IOException {
        File elArchivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        System.out.println(br.readLine());   
    }
}
