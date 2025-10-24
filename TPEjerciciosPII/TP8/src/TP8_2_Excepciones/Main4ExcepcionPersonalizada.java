package TP8_2_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hernán E. Bula
 *
 * Parte 2: Ejercicios sobre Excepciones 
 * 4. Excepción personalizada 
 * ○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje. 
 *
 */

public class Main4ExcepcionPersonalizada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int edad = 0;

        try {
            System.out.print("Ingrese su edad: ");
            edad = input.nextInt();
            setEdad(edad);
            System.out.println("---------------------\nUd. ingresó: " + edad + ".\nLa edad ingresada se encuentra entre el rango de esperanza de vida mínima y máxima");

        } catch (EdadInvalidaException eie) {
            System.out.println(eie.getMessage());
            System.out.println(".".repeat(40) + "\n ***** Stack Trace: *****\n");
            eie.printStackTrace(System.out);

        } catch (InputMismatchException ime) { // Primero se intentan capturar las excepciones más particulares
            System.out.println("\nEl dato ingresado no es un válido. Ingrese su edad en número entero.\n");
            System.out.println(".".repeat(40) + "\n ***** Stack Trace: *****\n");
            ime.printStackTrace(System.out);

        } finally {
            
            System.out.println("\n" + "-".repeat(25) + "\nFin del programa");
        }
    }

    public static void setEdad(int edad) {
        final int EDAD_MINIMA = 0;
        final int EDAD_MAXIMA = 120;
        if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
            throw new EdadInvalidaException("\nLa edad debe estar entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA + ". Ud. ingresó: " + edad);
        }
    }

}
