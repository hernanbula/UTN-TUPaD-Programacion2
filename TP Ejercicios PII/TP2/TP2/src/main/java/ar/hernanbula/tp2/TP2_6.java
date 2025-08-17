package ar.hernanbula.tp2;
import java.util.Scanner;

public class TP2_6 {

    /*
    @author Hernán E. Bula
    
    6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
    Ingrese el número 1: -5
        Resultados:
            Positivos: 4
            Negativos: 4
            Ceros: 2
    */
    
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
       
        int num, positivos = 0, negativos = 0, ceros = 0;
        
        System.out.println("\nCalcule la cantidad de +, - y 0.\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el " + (i+1) + "° número: ");
            num = imput.nextInt();
            if (num > 0) {
                positivos ++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros ++;
            }
        }
        
        System.out.println("\nRESULTADOS:\n");
        System.out.println("   # Positivos: " + positivos);
        System.out.println("   # Negativos: " + negativos);
        System.out.println("   # Ceros: " + ceros);
        
        
    } // Fin de main

    
} // Fin de Class
