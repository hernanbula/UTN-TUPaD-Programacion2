package ar.hernanbula.condicionalmultiple;

import java.util.Scanner;

/**
 * @author Hernán E. Bula
 */
public class CondicionalMultiple {

    public static void main(String[] args) {
        // Estructura de programación CONDICIONAL MÚLTIPLE / Flujo de selección múltiple / SWITCH
        
        Scanner input = new Scanner(System.in);
        int opcion;
        
        System.out.println("MENU DE OPCIONES con if-else if: ");
        System.out.println("[1] Ventas");
        System.out.println("[2] Soporte");
        System.out.println("[3] Administración");
        System.out.print("Elegir opción: ");
        
        opcion = Integer.parseInt(input.nextLine());
        
        if (opcion == 1) {
            System.out.println("VENTAS");
        } else if (opcion == 2) {
            System.out.println("SOPORTE");
        } else if (opcion == 3) {
            System.out.println("ADMINISTRACIÓN");
        } else {
            System.out.println("Inválido");
        }
        
        // La estructura anterior se puede reemplazar con un Flujo de selección múltiple, que simplifica el proceso.
        
        // La sintaxis del Switch:
        // switch (<var numérica o cadena>) {
        //      case <valor 1>:
        //          <instrucciones en caso valor 1>;
        //      break;
        //      case <valor 2>:
        //          <instrucciones en caso valor 2>;
        //      break;
        //      default:
        //          <instrucciones en caso default>;
        //      break;
        // }


        System.out.println("MENU DE OPCIONES con Switch: ");
        System.out.println("[1] Ventas");
        System.out.println("[2] Soporte");
        System.out.println("[3] Administración");
        System.out.print("Elegir opción: ");
        
        opcion = Integer.parseInt(input.nextLine());
        
        switch (opcion) {
            case 1:
                System.out.println("VENTAS");
                break;
            case 2:
                System.out.println("SOPORTE");
                break;
            case 3:
                System.out.println("ADMINISTRACIÓN");
                break;
            default:
                System.out.println("Inválido");
        }
        
        // Otra opción para switch en Java es el Rule Switch, que es lo mismo pero con una estructura más simple.

        System.out.println("MENU DE OPCIONES con Rule Switch: ");
        System.out.println("[1] Ventas");
        System.out.println("[2] Soporte");
        System.out.println("[3] Administración");
        System.out.print("Elegir opción: ");
        
        opcion = Integer.parseInt(input.nextLine());
        
        switch (opcion) { // formato "Rule Switch"
            case 1 -> System.out.println("VENTAS");
            case 2 -> System.out.println("SOPORTE");
            case 3 -> System.out.println("ADMINISTRACIÓN");
            default -> System.out.println("Inválido");
        }
        
    }
}
