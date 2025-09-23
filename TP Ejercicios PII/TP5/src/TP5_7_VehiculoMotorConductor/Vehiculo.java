
package TP5_7_VehiculoMotorConductor;

/**
 * @author Hernán E. Bula
 */

public class Vehiculo {
    
    private String patente, modelo;
    private Motor motor; // Agregacion
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) { // Agregación
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor) { //  Asociación bidireccional
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) { // Evita el bucle infinito y asegura consistencia.
            conductor.setVehiculo(this);
            System.out.println("\n------------\nSe ha asociado correctamente el conductor " + conductor.getNombre() + " al vehículo " + modelo + " (patente " + patente + ").");
        }
    }
    
    public Conductor getConductor() { 
        return conductor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    @Override
    public String toString() {
        if (conductor != null) {
            return "\n------------\nVehículo:" + "\n -Marca y modelo: " + modelo + "\n -Patente: " + patente + motor + conductor;
        } else {
            return "\n------------\nPara mostrar los datos completos del vehículo, " + modelo + " (patente " + patente + ") falta asociar un conductor al vehículo.";
        }
    }

}
   
