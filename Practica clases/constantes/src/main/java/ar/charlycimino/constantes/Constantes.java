package ar.charlycimino.constantes;

import java.util.Scanner;

public class Constantes {

    // CONSTANTES
    
        final static double JORNADAS_TRABAJADAS = 5.5;

    public static void main(String[] args) {
        
        // Calcula el sueldo semanal. Pedirle al usuario que ingrese su sueldo diario.
        
        Scanner input = new Scanner(System.in);
        
        double sueldoDiario, sueldoSemanal;
        
        System.out.print("Ingrese su sueldo diario para calcular el semanal: ");
        
        sueldoDiario = Double.parseDouble(input.nextLine());
        
        sueldoSemanal = sueldoDiario * JORNADAS_TRABAJADAS;
                
        System.out.println("Tu sueldo semanal es: " + sueldoSemanal);
        
    }
}
