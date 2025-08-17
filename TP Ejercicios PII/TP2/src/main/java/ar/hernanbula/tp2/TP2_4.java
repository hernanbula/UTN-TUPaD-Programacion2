package ar.hernanbula.tp2;

import java.util.Scanner;

public class TP2_4 {

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

        Scanner imput = new Scanner(System.in);

        double precio, precioFinal = 0;
        char opcion;
        String descuento = "";

        System.out.print("\nPara calcular el precio final con descuento:\nIngrese el precio del producto: $\n");
        precio = Double.parseDouble(imput.nextLine());
        System.out.println("CATEGORIAS:\n[A] 10% de descuento. \n[B] 15% de descuento. \n[C] 20% de descuento ");
        System.out.print("Ingrese la categoría [A/B/C]: ");
        opcion = imput.nextLine().toUpperCase().charAt(0);

        switch (opcion) {
            case 'A':
                precioFinal = 0.9;
                descuento = "10%.";
                break;
            case 'B':
                precioFinal = 0.85;
                descuento = "15%.";
                break;
            case 'C':
                precioFinal = 0.8;
                descuento = "20%.";
        }
        precioFinal *= precio;

        System.out.println("\n//////////////////////////////////////////\nPrecio inicial del producto: $" + precio);

        System.out.println("---------------------------\nDescuento: " + descuento);

        System.out.println("---------------------------\nPrecio final: $" + precioFinal + "\n");

    } // Fin de main

} // Fin de Class
