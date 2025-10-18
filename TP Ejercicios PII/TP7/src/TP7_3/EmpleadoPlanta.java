
package TP7_3;

/**
 * @author Hernán E. Bula
 */

public class EmpleadoPlanta extends Empleado {
   
    
    public EmpleadoPlanta(String nombre, String empresa, String tarea, int cantidadHorasExtras) {
        super(nombre, empresa, tarea, cantidadHorasExtras);
    }

    @Override
    public double calcularSueldo() {
        return (this.getSUELDO_BASICO()+ this.getSALARIO_FAMILIAR() + this.getAPORTES() + this.getCantidadHorasExtras() * this.getHORA_EXTRA());
    }

}
