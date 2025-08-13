/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OPERADORES ARITMETICOS
        
        /*
        Suma +
        Resta -
        Multiplicación *
        Division (entera) /
        Resto %
        */
        Scanner input = new Scanner(System.in);
        
        int suma, resta, multiplicacion, division, resto, num1, num2;
        
        System.out.print("Ingrese un número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;
        
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicación es " + multiplicacion);
        System.out.println("La división es " + division);
        System.out.println("El resto es " + resto);

        
        
    }
    
}
