package TP8_2_Excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Hernán E. Bula
 *
* Parte 2: Ejercicios sobre Excepciones
    5. Uso de try-with-resources
        ○ Leer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente.  
 */

public class Main5_TryWithResources {

    public static void main(String[] args) {

        VisorTxt txt = new VisorTxt();
        txt.mostrarTxt("src/TP8_2_Excepciones/TxtEjemplo.txt");
    }
}
