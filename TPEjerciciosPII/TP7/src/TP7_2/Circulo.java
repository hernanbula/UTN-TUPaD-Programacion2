
package TP7_2;


/**
 * @author Hernán E. Bula
 */

public class Circulo extends FigurasGeometricas {
    
    // Atributo particular de la clase
    private double radio;
    
    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override // Método sobreescrito de la superclase
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    

}
