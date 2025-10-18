
package TP7_1;

/**
 * @author Hernán E. Bula
 */

public class Vehiculo {

    private String marca, modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo() { 
        System.out.println("Vehiculo: \n - Marca: " + marca + "\n - Modelo: " + modelo);
    }
    
}
