
package TP5_7_VehiculoMotorConductor;

/**
 * @author Hernán E. Bula
 */

class Conductor {
    
    private String nombre, licencia;
    private Vehiculo vehiculo; // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    public void setVehiculo(Vehiculo vehiculo) { 
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) { // Evita el bucle infinito y asegura consistencia.
            vehiculo.setConductor(this);
            System.out.println("\n------------\nSe ha asociado correctamente un vehículo al conductor " + getNombre() + ".");
        }
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "\n------------\nConductor:" + "\n -Nombre y Apellido: " + nombre + "\n -Licencia: " + licencia;
    }
    
}
