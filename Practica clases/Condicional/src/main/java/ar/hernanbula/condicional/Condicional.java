package ar.hernanbula.condicional;

import java.util.Scanner;

/**
 *
 * @author Hernán E. Bula
 */
public class Condicional {

    public static void main(String[] args) {
        int a, b;
        double division;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresá un número: ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("Ingresá otro número: ");
        b = Integer.parseInt(input.nextLine());

        if (b != 0) {
            division = (double) a / b;

            System.out.println("El resultado de la división es " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
        System.out.println("Chau!");


    }
}
