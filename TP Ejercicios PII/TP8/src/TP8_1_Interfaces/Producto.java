
package TP8_1_Interfaces;

/**
 * @author Hernán E. Bula
 * Producto: tiene nombre y precio, implementa Pagable
 */

public class Producto implements Pagable{
    private String nombre;
    private double precio;

    @Override
    public double calcularTotal() {
        return this.precio; // El total de un producto es su precio individual.
    }
    

}
