package ar.hernanbula.tp2;

import java.util.Scanner;

public class TP2_5 {

    /*
    @author Hernán E. Bula
    
    5. Suma de Números Pares (while).
    Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
    Ejemplo de entrada/salida:
        Ingrese un número (0 para terminar): 4
        Ingrese un número (0 para terminar): 7
        Ingrese un número (0 para terminar): 2
        Ingrese un número (0 para terminar): 0
        La suma de los números pares es: 6
    
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        double suma = 0;
        double num = 0;

        System.out.println("\nSUMA DE NUMEROS PARES \n");
        do {
            System.out.print("Ingrese un número para sumar (0 para terminar): ");
            num = imput.nextDouble();
            if (num % 2 == 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("\n" + "-".repeat(72));
        System.out.println("La suma de los números pares ingresados es: " + suma + "\n");

    } // Fin de main

} // Fin de Class
