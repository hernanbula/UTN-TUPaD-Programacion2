package TP2;

import java.util.Scanner;

public class TP2_8 {

    /*
    @author Hernán E. Bula
    
    8. Cálculo del Precio Final con impuesto y descuento.
    Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
    PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
    PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
    Descuento)
    Desde main(), solicita el precio base del producto, el porcentaje de
    impuesto y el porcentaje de descuento, llama al método y muestra el precio
    final.
    
    Ejemplo de entrada/salida:
        Ingrese el precio base del producto: 100
        Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
        Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
        El precio final del producto es: 105.0
    
     */
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.print("\nCALCULE EL PRECIO FINAL DEL PRODUCTO\n");
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = imput.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = imput.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = imput.nextDouble();
        
        System.out.println("El precio final del producto es $" + calcularPrecioFinal(precioBase,impuesto,descuento));
        
    } // Fin de main

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = 0;
        
        precioFinal = precioBase + (precioBase * (impuesto/100)) - (precioBase * (descuento/100));

        return precioFinal;
    }
    
} // Fin de Class
