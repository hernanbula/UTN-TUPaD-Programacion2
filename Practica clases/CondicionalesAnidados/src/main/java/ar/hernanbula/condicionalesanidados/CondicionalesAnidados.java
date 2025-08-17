package ar.hernanbula.condicionalesanidados;
import java.util.Scanner;
/**
 * @author Hernán E. Bula
 */

public class CondicionalesAnidados {

    public static void main(String[] args) {
        
        int num;
        String resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresá un número entero: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num != 0) {
            if (num > 0) {
                resultado = "positivo";
            } else {
                resultado = "negativo";
            }
        } else {
            resultado = "neutro";
        }
        
        System.out.println("El número " + num + " es " + resultado);
        
        
        // Otra forma de solucionarlo con else if que es una estructura menos compleja
        
        System.out.print("Ingresá otro número entero: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num == 0) {
                resultado = "neutro";
            } else if (num > 0) {
                resultado = "positivo";
            } else {
            resultado = "negativo";
            }
    
        System.out.println("El número " + num + " es " + resultado);

    }
}
