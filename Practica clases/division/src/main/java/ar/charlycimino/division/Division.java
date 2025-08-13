package ar.charlycimino.division;

import java.util.Scanner;
        
public class Division {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int total, aprobados;
        double porcentajeAprobados;
        
        System.out.print("Ingrese el total de estudiantes: ");
        total = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el total de estudiantes aprobados: ");
        aprobados = Integer.parseInt(input.nextLine());
        
        porcentajeAprobados = ((double)aprobados / total) * 100; // Se hace un "casting" o "Promoción de tipos primitivos" con una de las variables, para que la división no de como resultado un numero entero, sino que muestre los decimales.
        
        System.out.println("Aprobó el " + (int)porcentajeAprobados + "% de estudiantes."); // Se hace un "casting" o "Promoción de tipos primitivos" con la variable porcentajeAprobados, para que muestre un numero entero y no los decimales.
        
        
    }
}
