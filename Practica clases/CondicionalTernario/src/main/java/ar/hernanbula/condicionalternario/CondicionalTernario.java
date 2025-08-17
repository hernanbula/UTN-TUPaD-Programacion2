package ar.hernanbula.condicionalternario;
import java.util.Scanner;
/**
 * @author Hernán E. Bula
 */
public class CondicionalTernario {

    public static void main(String[] args) {

        // Otra forma de solucionarlo con CONDICIONAL TERNARIO en Java ¡IF-ELSE en una línea!:
            // SINTAXIS: 
            //      (<expresion_lógica> ? <valor si true> : <valos si false> );

        Scanner input = new Scanner(System.in);
        int sillas, invitados, faltantes;
        
        System.out.print("Ingrese la cantidad de personas invitadas: ");
        invitados = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad de sillas: ");
        sillas = Integer.parseInt(input.nextLine());
        
        if (invitados > sillas) {
            faltantes = invitados - sillas;
            System.out.println("Conseguir " + faltantes + " silla" + (faltantes !=1 ? "s." : ".")); // si falta más de una silla, concatena una s al resultado impreso en consola. 
        } else {
            System.out.println("Las sillas son suficientes.");
        }

    }
}
