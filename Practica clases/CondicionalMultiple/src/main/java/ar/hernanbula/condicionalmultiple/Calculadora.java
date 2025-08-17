package ar.hernanbula.condicionalmultiple;

import java.util.Scanner;

/**
 * @author Hernán E. Bula
 */
public class Calculadora {

    public static void main(String[] args) {

        double num1, num2;
        double resultado = 0;
        char operacion;

        Scanner input = new Scanner(System.in);

        System.out.println("\nCALCULADORA\n");
        System.out.print("Ingrese un número: ");
        num1 = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese otro número: ");
        num2 = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la operación que desea realizar: + - x /");
        operacion = input.nextLine().charAt(0);

        switch (operacion) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case 'x' -> resultado = num1 * num2;
            case '/' -> {if (num2 != 0) {resultado = num1 / num2;}}
            default -> System.out.print("El caracter ingresado no es válido.");
        }

        System.out.println("El resultado de " + num1 + operacion + num2 + " es " + resultado);
    }
}
