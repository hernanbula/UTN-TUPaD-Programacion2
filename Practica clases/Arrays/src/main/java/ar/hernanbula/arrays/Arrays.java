package ar.hernanbula.arrays;

import java.util.Scanner;

/**
 * @author Hernán E. Bula
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int[] edades;
        edades = new int[6];
        
        double[] precios = new double[6];
        boolean[] flags = new boolean[3];
        char[] simbolos = new char[5];
        String[] palabras = new String[3];
        
        int[] edades2 = {27,40,19,33,58,61};
        double[] precios2 = {2.5,37.148,-2,123.99};
        boolean[] flags2 = {false, true, true};
        char[] simbolos2 = {'Z', '@', '4', 'h', '%'};
        String[] palabras2 = {"Hola", "Mundo"};
        
        System.out.println(precios2[3]);
        precios2[3] = 45.14;
        System.out.println(precios2[3]);
        
        for (int i = 0; i < edades2.length; i++) {
            System.out.println(edades2[i]);
        }
           
    }

}
