package TP8_2_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hernán E. Bula
 *
* Parte 2: Ejercicios sobre Excepciones
    2. Conversión de cadena a número
        ○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.
 */
public class Main2ConversionCadenaNum {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        String nombre; 
        String dni;
        int dni_num;
        
        try {
            System.out.print("Ingrese su nombre completo: ");
            nombre = input.nextLine();
            
            System.out.print("Ingrese DNI (solo numeros): ");
            dni = input.nextLine();
            dni_num = Integer.parseInt(dni);
            
            System.out.println("\n" + "-".repeat(30) + "\nDatos ingresados correctamente: \n - Nombre: " + nombre + "\n - DNI: " + dni_num);
            
        } catch (NumberFormatException nfe) { // Primero se intentan capturar las excepciones más particulares
            System.out.println("No se puede convertir el DNI a número. Evite caracteres no numericos.");

        } catch (Exception ex) { // Siempre la excepción más general va al final
            System.out.print("Ocurrio un error inesperado: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
        }
        finally {
            System.out.println("Fin del programa");        }

        
    

    }

}
