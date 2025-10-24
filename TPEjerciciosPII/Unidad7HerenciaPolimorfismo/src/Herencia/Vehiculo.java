
package Herencia;

/**
 * @author Hernán E. Bula
 */

public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    
    public void acelerar() { 
        System.out.println("Acelerando...");
    }
    public void frenar() { 
        System.out.println("Frenando...");
    }
    public void encender() { 
        System.out.println("Encendiendo...");
    }

    public String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    protected void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return ".".repeat(40) + "\nVehiculo: " + "\n - Marca: " + marca + "\n - Modelo: " + modelo + "\n - Patente: " + patente;
    }
    
    

}
