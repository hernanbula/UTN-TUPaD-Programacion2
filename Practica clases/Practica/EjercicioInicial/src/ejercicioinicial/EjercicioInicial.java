
package ejercicioinicial;

import java.util.Scanner;

public class EjercicioInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular la edad del usuario
        
        Scanner input = new Scanner(System.in);
        
        int nacimiento, anioActual, edad;
        
        System.out.print("Ingrese su año de nacimiento: ");
        
        nacimiento = input.nextInt();
        
        anioActual = 2025;
               
        edad = anioActual - nacimiento;
        
        System.out.println("Usted tiene " + edad + " años ó " + (edad-1) + " años, si aun no cumplió");
        
    }

}
