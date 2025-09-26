package ar.hernanbula.tp2;

import java.util.Arrays;
import java.util.Scanner;

public class TP2_9b {

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

        double peso, precio, costoEnvio, totalPagar;
        char zona;

        Scanner input = new Scanner(System.in);

        System.out.println("\n" + "-".repeat(72)); // Linea divisoria

        System.out.println("\n- CALCULE EL TOTAL DE LA COMPRA -\n");

        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete: ");
        peso = Integer.parseInt(input.nextLine());

        do {
            System.out.print("Ingrese tipo del envío [N = Nacional / I = Internacional]: ");
            zona = input.nextLine().toUpperCase().charAt(0);
        } while (zona != 'N' && zona != 'I');

        costoEnvio = calcularCostoEnvio(peso, zona);

        totalPagar = calcularTotalCompra(precio, costoEnvio);

        System.out.println("\n" + "-".repeat(72)); // Linea divisoria

        System.out.println("\nEl costo de envío es: \t" + costoEnvio);
        System.out.println("\nEl total a pagar es: \t" + totalPagar);

        System.out.println("\n" + "-".repeat(72)); // Linea divisoria

    } // Fin de Main

    static double calcularCostoEnvio(double peso, char zona) {
        double costoEnvio = 0;

        if (zona == 'N') {
            costoEnvio = peso * 5;
        } else if (zona == 'I') {
            costoEnvio = peso * 10;
        }
        return costoEnvio;
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

} // Fin de Class

