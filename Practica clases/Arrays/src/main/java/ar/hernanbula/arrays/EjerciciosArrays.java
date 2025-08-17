package ar.hernanbula.arrays;

import java.util.Scanner;

public class EjerciciosArrays {

    final static int CANTIDAD_VALORES = 8;

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int acumulador;
        double promedio;

        // Crear un vector de 8 enteros
        int[] numeros = new int[CANTIDAD_VALORES];

        // Pedir 8 numero enteros
        cargarValores(numeros);

        // Calcular el promedio y mostrarlo
        promedio = calcularPromedio(numeros);

        System.out.println("El promedio de los números ingresados es: " + promedio);

        // Mostrar valores superiores al promedio
        mostrarValoresMayoresQue(promedio, numeros);

        
    } // Cierre del main
    
    // FUNCIONES O METODOS
    
    public static void cargarValores(int[] valores) {
        Scanner imput = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingrese el " + (i + 1) + "° valor: ");
            valores[i] = Integer.parseInt(imput.nextLine());
        }
    }

    public static double calcularPromedio(int[] valores) {

        double acumulador = 0;
        double promedio;

        for (int i = 0; i < valores.length; i++) {
            acumulador += valores[i];
        }

        promedio = acumulador / valores.length;

        return promedio;

    }

    private static void mostrarValoresMayoresQue(double valor, int[] valores) {
        System.out.println("Los números ingresados superiores al promedio son: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > valor) {
                System.out.println(valores[i]);
            }

        }
    }

} // Cierre de la clase
