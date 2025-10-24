
package ExcepcionesCheckedUncheked;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Hernán E. Bula
 */

public class Main {
    
    // Manejo de excepciones "checked"

    public static void main(String[] args) {
        
        VisorTxt txt = new VisorTxt();
        try {
            txt.mostrarTxt("~\\build\\classes\\ExcepcionesCheckedUncheked\\TxtEjemplo.txt"); // No se como acceder a la ruta correcta
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe.");
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida.");
            System.out.println(ex.getMessage());

        }

        
    } 

}
