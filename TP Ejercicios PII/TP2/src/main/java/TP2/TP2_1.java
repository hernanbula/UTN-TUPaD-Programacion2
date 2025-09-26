package TP2;

import java.util.Scanner;

/**
 * @author Hernán E. Bula
 */
public class TP2_1 {

    public static void main(String[] args) {
        
        /*
        1. Verificación de Año Bisiesto.
            Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4 pero no por 100, salvo que sea divisible por 400.
        */
        
        Scanner imput = new Scanner(System.in);
        System.out.println("Calcule si el año es bisiesto.");
        System.out.print("Ingrese un año: ");
                int anio = imput.nextInt();          
        if ((esMultiplo(anio,4) && !esMultiplo(anio, 100)) || esMultiplo(anio, 400)) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }

    } // Fin main

            // FUNCIONES O METODOS

    public static boolean esMultiplo(int multiplo, int numero) {
        return multiplo % numero == 0;
    }
            

} // Fin Clase
