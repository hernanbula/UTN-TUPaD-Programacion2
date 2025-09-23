
package TP5_1_PasaporteFotoTitular;

/**
 * @author Hernán E. Bula
 * 
 * Ejercicios de Relaciones 1 a 1
    1. Pasaporte - Foto - Titular
        a. Composición: Pasaporte → Foto
        b. Asociación bidireccional: Pasaporte ↔ Titular
    Clases y atributos:
        i. Pasaporte: numero, fechaEmision
        ii. Foto: imagen, formato
        iii. Titular: nombre, dni
* 
 */

public class TP5_1_PasaporteFotoTitular {

    public static void main(String[] args) {
        
        Titular titular1 = new Titular("Hernán E. Bula", "1234567");

        Pasaporte pass1 = new Pasaporte("AA123456", "2025-09-17", "https://www.pasaporte.com.ar/wp-content/uploads/2019/06/pasaporte-argentino.jpg", ".png"); // Composición
        
        titular1.setPasaporte(pass1); // Asociación bidireccional
        
        pass1.setTitular(titular1); // Asociación bidireccional. Asegurando que no se hace bucle infinito
        
        System.out.println(pass1);

    }

}
