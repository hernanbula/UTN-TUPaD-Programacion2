
package Agregacion1a1;

/**
 * @author Hernán E. Bula
 */

public class Motor {
    
    private String tipo;
    private String combustible;
    private double cilindrada;
    
    public Motor(String tipo, double cilindrada, String combustible) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String getCombustible() {
        return combustible;
    }
    
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
