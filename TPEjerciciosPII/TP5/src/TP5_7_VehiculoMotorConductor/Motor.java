
package TP5_7_VehiculoMotorConductor;

/**
 * @author Hernán E. Bula
 */

class Motor {
    
    private String tipo, numeroSerie;
    
    public Motor(String tipo, String numeroSerie) { 
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    @Override
    public String toString() {
        return "\n -Motor " + tipo + " (N° serie: " + numeroSerie + ").";
    }

}
