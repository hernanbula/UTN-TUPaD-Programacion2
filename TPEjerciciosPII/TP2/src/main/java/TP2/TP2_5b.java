package TP2;

import java.util.Scanner;

public class TP2_5b {

    /*
    @author Hernán E. Bula
    
    5. Suma de Números Pares (while).
    Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
    Ejemplo de entrada/salida:
        Ingrese un número (0 para terminar): 4
        Ingrese un número (0 para terminar): 7
        Ingrese un número (0 parimputa terminar): 2
        Ingrese un número (0 para terminar): 0
        La suma de los números pares es: 6
    
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double suma = 0;
        double numero;

        System.out.println("\nSUMA DE NUMEROS PARES\n");
        System.out.print("Ingrese un numero (para salir ingrese 0): ");
        numero = Double.parseDouble(input.nextLine());

        while (numero != 0) {
            System.out.print("Ingrese un numero (para salir ingrese 0): ");
            numero = Double.parseDouble(input.nextLine());
            if (numero % 2 == 0) {
                suma += numero;
            }
        }
        
        System.out.println("La suma de los números pares es: " + suma);

    } // Fin de main

} // Fin de Class
