
package TP7_2;


/**
 * @author Hernán E. Bula
 */

public class Circulo extends FigurasGeometricas {
    
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    

}
