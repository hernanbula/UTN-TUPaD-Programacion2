package TP2;

import java.util.Scanner;

public class TP2_13 {

    /*
    @author Hernán E. Bula
    
    13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.

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
    ✔ Recorrido del array con una función recursiva en lugar de un bucle.
    ✔ Modificación de un valor en un array mediante un índice.
    ✔ Uso de un índice como parámetro en la recursión para recorrer el array
     */
    
    final static int INDICE_INICIAL = 0;
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

//      Declara e inicializa un array con los precios de algunos productos.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99}; 
        
//      b. Muestra los valores originales de los precios.   
        System.out.println("\nPrecios originales:");
        imprimirListaRecursiva(precios, INDICE_INICIAL);
        
//      c. Modifica el precio de un producto específico.
        System.out.println("\nSe actualiza el precio del producto 3: $129.99");
        precios[2] = 129.99;
            
//      d. Muestre los valores modificados.
        System.out.println("\nPrecios modificados:");
        imprimirListaRecursiva(precios, INDICE_INICIAL);

    } // Fin de main
    
    // Metodo recursivo que recibe una lista y un indice inicial para imprirla.
    final static void imprimirListaRecursiva(double lista[], int indiceInicial) {
             
        if (indiceInicial >= lista.length) {
            System.out.print("");
        } else {
            System.out.println("  - Precio: $" + lista[indiceInicial]);
            imprimirListaRecursiva(lista, (indiceInicial+1));
            
        }
    }

    
} // Fin de Class
