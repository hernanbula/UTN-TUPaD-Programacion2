
package TP5_2_CelularBateriaUsuario;

/**
 * @author Hernán E. Bula
 */

public class Bateria {

    private String modelo, capacidad;

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "--------------\nBateria:\n -Modelo: " + modelo + "\n -Capacidad: " + capacidad;
    }
}
