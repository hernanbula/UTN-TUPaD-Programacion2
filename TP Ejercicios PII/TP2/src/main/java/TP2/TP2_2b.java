package TP2;

import java.util.Scanner;

public class TP2_2b {

    public static void main(String[] args) {

        /*
    2. Determinar el Mayor de Tres Números.
        Escribe un programa en Java que pida al usuario 5 números enteros y determine cuál es el mayor.
         */
        Scanner input = new Scanner(System.in);

        double numero, mayor;

        System.out.println("Ingrese el 1° número: ");
        mayor = input.nextDouble();

        for (int i = 2; i <= 5; i++) {
            System.out.println("Ingrese el " + i + "° número: ");
            numero = input.nextDouble();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        
        System.out.println("El mayor numero de los valores ingresados es: " + mayor);

    } // Fin de main

} // Fin de Class
