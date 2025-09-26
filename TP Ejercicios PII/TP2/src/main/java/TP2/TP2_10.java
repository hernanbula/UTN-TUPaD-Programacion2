package TP2;

import java.util.Scanner;

public class TP2_10 {

    /*
    @author Hernán E. Bula
    
    10. Actualización de stock a partir de venta y recepción de productos.
    Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción de productos:
    NuevoStock = StockActual − CantidadVendida + CantidadRecibida
    NuevoStock = CantidadVendida + CantidadRecibida
    Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
        Ejemplo de entrada/salida:
            Ingrese el stock actual del producto: 50
            Ingrese la cantidad vendida: 20
            Ingrese la cantidad recibida: 30
            El nuevo stock del producto es: 60

     */
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        
        int stockActual, cantidadVendida, cantidadRecibida;
        int nuevoStock = 0;
        
        System.out.print("\nCALCULAR STOCK PRODUCTO\n\n");
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(imput.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(imput.nextLine());
        
        System.out.print("Ingrese la cantidad recibida ");
        cantidadRecibida = Integer.parseInt(imput.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es " + nuevoStock);
        
        
    } // Fin de main

    static final int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return (stockActual - cantidadVendida + cantidadRecibida);
    }
    
} // Fin de Class
