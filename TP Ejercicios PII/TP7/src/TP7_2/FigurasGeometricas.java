
package TP7_2;

/**
 * @author Hernán E. Bula
 */

public abstract class FigurasGeometricas {
    
    private String nombre;

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }

}
