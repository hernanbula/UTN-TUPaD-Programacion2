
package TP7_3;

/**
 * @author Hernán E. Bula
 */

public class EmpleadoTemporal extends Empleado {
    
    private int horasExtra;
    
    public EmpleadoTemporal(String nombre, String empresa, String tarea, int cantidadHorasExtras) {
        super(nombre, empresa, tarea, cantidadHorasExtras);
    }

    @Override
    public double calcularSueldo() {
        return (this.getSUELDO_BASICO() + this.getCantidadHorasExtras() * this.getHORA_EXTRA());
    }

}
