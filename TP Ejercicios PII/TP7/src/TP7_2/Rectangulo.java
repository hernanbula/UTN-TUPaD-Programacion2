
package TP7_2;

/**
 * @author Hernán E. Bula
 */

public class Rectangulo extends FigurasGeometricas {
    
    private double base, altura;
    
    public Rectangulo(String nombre, double base, double altura) { 
        super(nombre);
        this.base = base;
        this.altura = altura;        
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
    

}
