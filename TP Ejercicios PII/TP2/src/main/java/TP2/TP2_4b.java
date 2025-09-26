package TP2;

import java.util.Scanner;

public class TP2_4b {

    /*
    @author Hernán E. Bula
    
    4. Calculadora de Descuento según categoría. 
    Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C). 
    Luego, aplique los siguientes descuentos: 
    Categoría A: 10% de descuento 
    Categoría B: 15% de descuento 
    Categoría C: 20% de descuento 
    El programa debe mostrar el precio original, el descuento aplicado y el precio final
    
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double precioFinal = 0;
        double precio = 0;
        char categoria;
        String descuento = "";

        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la categoría de descuento (A/B/C): ");
        categoria = input.nextLine().toUpperCase().charAt(0);

        switch (categoria) {
            case 'A':
                precioFinal = 0.9;
                descuento = "10%";
                break;
            case 'B':
                precioFinal = 0.85;
                descuento = "15%";
                break;
            case 'C':
                precioFinal = 0.8;
                descuento = "20%";
                break;
        }
        
        precioFinal *= precio;
        
        System.out.println("\n" + "-".repeat(72)); // Linea divisoria

        System.out.println("\n \nPRODUCTO:\n\n  -Precio original:\t$" + precio + "\n  -Descuento aplicado:\t" + descuento + "\n  -Precio final:\t\t$" + precioFinal + "\n");

    } // Fin de main

} // Fin de Class
