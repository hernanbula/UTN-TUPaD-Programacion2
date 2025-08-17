package ar.hernanbula.libreriametodospropios;

import java.util.Scanner;

public class MetodosPropios {

    static int leerEnteroEntre(String mensaje, int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine());
        while (x < min || x > max) {
            System.out.println("ERROR. " + mensaje + ": ");
            x = Integer.parseInt(input.nextLine());
        }
        return x;
    }

    static int obtenerResto(int dividendo, int divisor) {
        // dividendo - divisor * cociente
        int cociente = dividendo / divisor;
        return dividendo - divisor * cociente;
        // es lo mismo que: return dividendo % divisor;
    }

    static boolean esMultiplo(int a, int b) {
        return obtenerResto(a, b) == 0;
    }
    
    static int factorial(int num) {
        return num == 0 ? 1 : num * factorial(num-1);
    }
}
