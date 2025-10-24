
package Herencia;

/**
 * @author Hernán E. Bula
 */

public class Auto extends Vehiculo {
    
    private boolean tieneAire;
    
    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }
    
    public void prenderAire() { 
        if (tieneAire) {
            System.out.println("Encendiendo el aire...");
        }
    }

    @Override
    public String toString() {
        return ".".repeat(40) + "\nAuto" + "\n - Marca: " + this.getMarca() + "\n - Modelo: " + this.getModelo() + "\n - Patente: " + this.getPatente() + "\n - Tiene aire: " + tieneAire;
    }

}
