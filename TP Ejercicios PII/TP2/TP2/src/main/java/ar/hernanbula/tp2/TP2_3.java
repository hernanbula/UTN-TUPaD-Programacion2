package ar.hernanbula.tp2;
import java.util.Scanner;

public class TP2_3 {

    /*
    3. Clasificación de Edad.
        Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
        Menor de 12 años: "Niño"
        Entre 12 y 17 años: "Adolescente"
        Entre 18 y 59 años: "Adulto"
        60 años o más: "Adulto mayor"
    */
    
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = imput.nextInt();
        String etapa = "";
        
        if (edad < 12) {
            etapa = "niño.";
        } else if (edad < 18) {
            etapa = "adolescente.";
        } else if (edad < 60 ) {
            etapa = "adulto.";
        } else {
            etapa = "adulto mayor.";   
        }
            System.out.println("Con " + edad + " años de edad, usted es un " + etapa);
        
    } // Fin de main

    
} // Fin de Class
