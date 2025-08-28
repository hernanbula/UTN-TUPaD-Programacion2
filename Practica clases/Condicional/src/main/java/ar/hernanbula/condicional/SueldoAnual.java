package ar.hernanbula.condicional;

import java.util.Scanner;

/**
 *
 * @author Hernán E. Bula
 */
public class SueldoAnual {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    double sueldoMensual, sueldoAnual = 0;
    int i = 1, meses = 12;
    
    do {
        System.out.print("Ingrese su sueldo para el mes n° " + i + ": ");
        sueldoMensual = Double.parseDouble(input.nextLine());
        if (sueldoMensual> 0){
            sueldoAnual += sueldoMensual;
        }
        i++;          
    }
        while (i<=meses && sueldoMensual>0);

        System.out.println("Tu sueldo anual es " + sueldoAnual);

    }
}
