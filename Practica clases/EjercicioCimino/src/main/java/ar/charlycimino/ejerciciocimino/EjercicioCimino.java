package ar.charlycimino.ejerciciocimino;

import java.util.Scanner;

public class EjercicioCimino {

    // CONSTANTES
        
        final static int VUELTAS_ALAMBRE = 3;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double ancho, largo, precioM2, superficie, perimetro, precioTerreno, metrosAlambre;
        
        System.out.print("Ingrese el ancho del terreno: ");
        ancho = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el largo del terreno: ");
        largo = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el precio del M² del terreno: ");
        precioM2 = Double.parseDouble(input.nextLine());
        
        superficie = largo * ancho;

        precioTerreno = superficie * precioM2;
        
        perimetro = largo * 2 + ancho * 2;
        
        metrosAlambre = perimetro * VUELTAS_ALAMBRE;
        
        System.out.println("El precio del terreno es: USD" + precioTerreno);
        System.out.println("Se necesitan " + metrosAlambre + " metros de alambre para cercarlo en " + VUELTAS_ALAMBRE + " pasadas.");
        
    }
}
