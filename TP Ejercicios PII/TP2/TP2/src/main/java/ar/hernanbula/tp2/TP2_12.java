package ar.hernanbula.tp2;

import java.util.Scanner;

public class TP2_12 {

    /*
    @author Hernán E. Bula
    
    12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
        Salida esperada:
        Precios originales:
        Precio: $199.99
        Precio: $299.5
        Precio: $149.75
        Precio: $399.0
        Precio: $89.99
        Precios modificados:
        Precio: $199.99
        Precio: $299.5
        Precio: $129.99
        Precio: $399.0
        Precio: $89.99

Conceptos Clave Aplicados:
    ✔ Uso de arrays (double[]) para almacenar valores.
    ✔ Recorrido del array con for-each para mostrar valores.
    ✔ Modificación de un valor en un array mediante un índice.
    ✔ Reimpresión del array después de la modificación.
     */
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

//      Declara e inicializa un array con los precios de algunos productos.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99}; 
        
//      b. Muestra los valores originales de los precios.      
        imprimirLista("\nLISTA DE PRECIOS\n", "Precio ", precios);
        
//      c. Modifica el precio de un producto específico.
        System.out.println("\nSe actualiza el precio del producto 3: $129.99");
        precios[2] = 129.99;
            
//      d. Muestre los valores modificados.
        imprimirLista("\nLISTA DE PRECIOS MODIFICADA\n", "Precio ", precios);

    } // Fin de main
    // Metodo que recibe una lista y la imprime. También recibe un mensaje y el nombre de los elementos de la lista
    final static void imprimirLista(String mensaje, String elemento, double lista[]) {
        System.out.println(mensaje);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(elemento + (i+1) + ": " + lista[i]);
        }
    }
    
} // Fin de Class
