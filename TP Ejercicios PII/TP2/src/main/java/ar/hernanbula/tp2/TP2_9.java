package ar.hernanbula.tp2;

import java.util.Scanner;

public class TP2_9 {

    /*
    @author Hernán E. Bula
    
    9. Composición de funciones para calcular costo de envío y total de compra.
        a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
        Nacional: $5 por kg
        Internacional: $10 por kg
        b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
        Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
        Ejemplo de entrada/salida:
            Ingrese el precio del producto: 50
            Ingrese el peso del paquete en kg: 2
            Ingrese la zona de envío (Nacional/Internacional): Nacional
            El costo de envío es: 10.0
            El total a pagar es: 60.0
    
     */
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        
        System.out.println("\nCALCULE EL TOTAL CON COSTO DE ENVIO INCLUIDO\n");
        
        System.out.print("Ingrese el precio del producto: $");
        double precio = Double.parseDouble(imput.nextLine());
        
        System.out.print("Ingrese el peso del paquete [Kg]: ");
        double peso = Double.parseDouble(imput.nextLine());
        
        System.out.print("Ingrese la zona de envío [N] Nacional o [I] Internacional [N/I]: ");
        String zona = imput.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("\nEl costo del envío es: $" + costoEnvio + "\n");
        
        double precioFinal = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El total a pagar es: $" + precioFinal + "\n");
        
    } // Fin de main
    
    static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;
        if ("N".equals(zona)) {
        // Nacional: $5 por kg
            costo = (peso * 5);
        } else if ("I".equals(zona)) {
        // Internacional: $10 por kg
            costo = (peso * 10);
        }
            return costo;
    }
        
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double total = precioProducto + costoEnvio;
        return total;
    }
    
} // Fin de Class
