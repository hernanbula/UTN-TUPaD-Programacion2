package ar.hernanbula.tp2;

import java.util.Scanner;

public class TP2_7 {

    /*
    @author Hernán E. Bula
    
    7. Validación de Nota entre 0 y 10 (do-while).
    Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.
    Ejemplo de entrada/salida:
        Ingrese una nota (0-10): 15
        Error: Nota inválida. Ingrese una nota entre 0 y 10.
        Ingrese una nota (0-10): -2
        Error: Nota inválida. Ingrese una nota entre 0 y 10.
        Ingrese una nota (0-10): 8
        Nota guardada correctamente.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int num;
        
        System.out.println("\n" + "-".repeat(72)); // Linea divisoria
        num = validarValorEntre("Ingrese un número entre 0 y 10: ", 0, 10);
        System.out.println("Nota guardada correctamente.");
        System.out.println("-".repeat(72)); // Linea divisoria

    } // Fin de main

    static int validarValorEntre(String mensaje, int min, int max) {
        Scanner imput = new Scanner(System.in);
        int num;
        do {
            System.out.print(mensaje);
            num = Integer.parseInt(imput.nextLine());
            if (num < min || num > max) {
                System.out.print("ERROR. ");
            }
        } while (num < min || num > max);

        return num;
    }

} // Fin de Class
