/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caracteresdeescape;

/**
 *
 * @author usuario
 */
public class CaracteresDeEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CARACTERES DE ESCAPE
        
        // Se usa \ para mostrar el caracter y resolver ambiguedades
        
        // Por ejemplo para imprimir un texto con comillas:
        System.out.println("Descartes dijo \"Pienso, luego existo\"");
        
        // Por ejemplo, para imprimir una ruta de un archivo Por ejemplo: C:\User\Archivo, debo usar doble \\:
        System.out.println("C:\\User\\Archivo");
        
        // Por ejemplo, para imprimir un salto de línea se usa \n:
        System.out.println("Uno\nDos\nTres");
        
        // Por ejemplo, para imprimir un salto de tabulación (cuatro espacios) se usa \t:
        System.out.println("Uno\tDos\tTres"); // esto suele ser útil para imprimir tablas en la consola
        
        // Otros caracteres de escape
        System.out.println("Uno\bDos\bTres"); // Este caracter de escape \b retrocede una línea
        System.out.println("Uno\rDos\rTres"); // Este caracter de escape \r retrocede al inicio de la línea y sobreescribe

    }
    
}
