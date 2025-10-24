
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hernán E. Bula
 */

public class Main {

    public static void main(String[] args) {

        Throwable t = new Throwable("ERROR AMIGO");
        Exception e = new Exception();
        RuntimeException r = new RuntimeException();
        Error er = new Error();


        // Instrucciones sin posibles excepciones
        
//        try {
            // Instrucción con posible excepción
            // Instrucciones que dependen de la que posiblemente lance una excepción
//        } catch(UnTipoDeExcepcion ex) { 
            // Alguna logica en caso de capturar una excepción de tipo "UnTipoDeExcepcion"
//        } finally {
            // Bloque opcional: se ejecuta en cualquiera de los casos
//        }
        // Instrucciones sin posibles excepciones
        
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        
        try {
        y = new Scanner(System.in).nextInt();
        z = x / y;
        
        System.out.println("Resultado: " + z);
        } 
        
        catch (InputMismatchException ime){ // Primero se intentan capturar las excepciones más particulares
            System.out.println("No es un entero.");
        }
        
        catch (ArithmeticException ae){
            System.out.println("No se puede dividir por cero.");
            
        }
        
        catch(Exception ex) { // Siempre la excepción más general va al final
            System.out.print("Ocurrio un error: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
        }
        
        System.out.println("Adios nuevamente");
       
            
        
    } 

}
