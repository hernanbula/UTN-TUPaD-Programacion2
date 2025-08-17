/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ar.hernanbula.operadoresrelacionales;

import java.util.Scanner;
/**
 *
 * @author Hernán E. Bula
 */
public class OperadoresRelacionales {

    public static void main(String[] args) {
        System.out.println(4<5);
        System.out.println(5<=5);
        System.out.println(4>5);
        System.out.println(4>=5);
        System.out.println(4==5);
        System.out.println(4!=5);
        
        // Comparar Strings (USAR EQUALS)
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreDePersona = input.nextLine();
        String nombreEsperado = "Juan";
        System.out.println(nombreDePersona.equals(nombreEsperado)); // compara exactamente caracter por caracter
        System.out.println(nombreDePersona.equalsIgnoreCase(nombreEsperado)); // compara ignorando Mayúsculas y minúsculas
        
        // NO SE DEBE USAR "==" para comparar: System.out.println(nombreDePersona == nombreEsperado);
        
        
    }
}
