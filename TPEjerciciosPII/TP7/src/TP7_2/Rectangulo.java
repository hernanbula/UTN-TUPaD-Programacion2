
package TP7_2;

/**
 * @author Hernán E. Bula
 */

public class Rectangulo extends FigurasGeometricas {
    
    // Atributos particulares de la clase
    private double base, altura;
    
// Constructor
    public Rectangulo(String nombre, double base, double altura) { 
        super(nombre);
        this.base = base;
        this.altura = altura;        
    }

    @Override // Método sobreescrito de la superclase
    public double calcularArea() {
        return base * altura;
    }
    

}
