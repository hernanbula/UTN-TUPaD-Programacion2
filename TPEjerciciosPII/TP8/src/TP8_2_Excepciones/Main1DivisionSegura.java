package TP8_2_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hernán E. Bula
 *
* Parte 2: Ejercicios sobre Excepciones
    1. División segura
        ○ Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.
    2. Conversión de cadena a número
        ○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.
    3. Lectura de archivo
        ○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
    4. Excepción personalizada
        ○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
    5. Uso de try-with-resources
        ○ Leer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente.  
* 
 */
public class Main1DivisionSegura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, cociente;
        
        try {
            System.out.print("Ingrese un numero para dividir: ");
            num1 = input.nextInt();
            
            System.out.print("Ingrese un numero divisor: ");
            num2 = input.nextInt();
            
            cociente = num1 / num2;

            System.out.println("Resultado de la división: " + cociente);
            
        } catch (InputMismatchException ime) { // Primero se intentan capturar las excepciones más particulares
            System.out.println("No es un entero.");
            
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero.");

        } catch (Exception ex) { // Siempre la excepción más general va al final
            System.out.print("Ocurrio un error: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
        }

        System.out.println("Fin del programa");
    

    }

}
