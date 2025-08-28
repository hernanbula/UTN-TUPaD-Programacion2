
package poo_inicio;

import java.util.Scanner;

public class POO_inicio {

/*
@author Hernán E. Bula
*/
    
    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        
        Auto miAuto = new Auto();
        // El estado inicial de un objeto, si no inicializamos el estado de sus atributos, por defecto son: Strings = null; numéricos = 0, booleanos = false.
        System.out.println(miAuto.marca + " " + miAuto.modelo + " " + miAuto.anio + " " + miAuto.color + " " + miAuto.airbag + " " + miAuto.velocidad);
        
        // Inicializamos el estado del objeto
        miAuto.marca = "VolskVagen";
        miAuto.modelo = "Nivus";
        miAuto.anio = 2025;
        miAuto.color = "Gris plantino";
        miAuto.airbag = true;
        miAuto.velocidad = 220;
        
        System.out.println(miAuto.marca + " " + miAuto.modelo + " " + miAuto.anio + " " + miAuto.color + " " + miAuto.airbag + " " + miAuto.velocidad);
          
        miAuto.acelerar();
        
        
        
    } // Fin de main

    
} // Fin de Class
