/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitardatos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SolicitarDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Solicitar datos con Scanner
        
        Scanner input = new Scanner(System.in);
        
        // Defino variables y tipos
        String nombre;
        int edad;
        double altura;
        boolean tieneHijos;
        
        // Solicito ingreso de valores al usuario por consola
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine()); // De esta forma solicito al usuario ingrese una cadena y lo transformo en entero
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su altura: ");
        altura = Double.parseDouble(input.nextLine()); // De esta forma solicito al usuario ingrese una cadena y lo transformo en flotante
        
        System.out.print("Ingrese si tiene hijos: ");
        tieneHijos = input.nextBoolean();
                
        System.out.println("Hola " + nombre +".");
        System.out.println("Tu edad es " + edad + " años."); 
        System.out.println("Tu altura es de " + altura + " pesos.");
        System.out.println("¿Tienes hijos? " + tieneHijos);
        
        
           
    }
    
}
