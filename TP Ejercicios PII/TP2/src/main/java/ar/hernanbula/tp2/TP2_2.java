package ar.hernanbula.tp2;
import java.util.Scanner;

public class TP2_2 {

    public static void main(String[] args) {
    
    /*
    2. Determinar el Mayor de Tres Números.
        Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
        */
    
    Scanner imput = new Scanner(System.in);
    
        System.out.println("Determine el mayor.");
        System.out.print("Ingrese un número: ");
        double mayor = imput.nextInt();
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese otro número: ");
            double num = imput.nextInt();
            if (num > mayor) {
                mayor = num;
            }
            System.out.println("El mayor es: " + mayor);
        }
        
    } // Fin de main

    
} // Fin de Class
