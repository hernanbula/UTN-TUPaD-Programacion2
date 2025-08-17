package ar.hernanbula.tp2;

import java.util.Scanner;

public class TP2_11 {

    /*
    @author Hernán E. Bula
    
    11. Cálculo de descuento especial usando variable global.
Declara una variable global. Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%. Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
    Ejemplo de entrada/salida:
        Ingrese el precio del producto: 200
        El descuento especial aplicado es: 20.0
        El precio final con descuento es: 180.0
     */
    final static double DESCUENTO = 0.10;

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        double precio, precioFinal, precioDescuento; // Declaración variables

        System.out.println("\nCALCULE EL PRECIO CON DESCUENTO\n");
        
        System.out.print("Ingrese el precio del producto: $"); // Solicita el precio
        precio = Double.parseDouble(imput.nextLine());

        calcularDescuentoEspecial(precio); // Llama a la función para hacer el cálculo

    } // Fin de main

    static final void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = (precio * DESCUENTO);
        System.out.println("El descuento especial aplicado es: $" + descuentoAplicado); // precio descuento
        System.out.println("El precio final con descuento es: $" + (precio - descuentoAplicado)); // precio final con descuento
    }

} // Fin de Class
