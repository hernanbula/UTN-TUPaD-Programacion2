
package poo_inicio;

/*
@author Hernán E. Bula 
*/

public class Auto {
 // Declaramos los atributos del objeto
    String marca;
    String modelo;
    int anio;
    String color;
    String patente;
    boolean airbag;
    int velocidad;
    
    void acelerar() {
        velocidad += 10;
        System.out.println("El coche aceleró. Velocidad: " + velocidad);
    }

}
