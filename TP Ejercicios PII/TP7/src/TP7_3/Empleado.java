
package TP7_3;

/**
 * @author Hernán E. Bula
 */

public abstract class Empleado {
    
    private String nombre, empresa, tarea;
    private int cantidadHorasExtras;
    
    private final double SUELDO_BASICO = 900000;
    private final double SALARIO_FAMILIAR = 150000;
    private final double APORTES = SUELDO_BASICO * 0.3;
    private final double HORA_EXTRA = 10000;

    public Empleado(String nombre, String empresa, String tarea, int cantidadHorasExtras) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.tarea = tarea;
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getTarea() {
        return tarea;
    }

    public int getCantidadHorasExtras() {
        return cantidadHorasExtras;
    }

    public double getSUELDO_BASICO() {
        return SUELDO_BASICO;
    }

    public double getSALARIO_FAMILIAR() {
        return SALARIO_FAMILIAR;
    }

    public double getAPORTES() {
        return APORTES;
    }

    public double getHORA_EXTRA() {
        return HORA_EXTRA;
    }
    
    public void mostrarInfo() { 
        System.out.println(".".repeat(30) + "\nEmpleado: \n - Nombre: " + getNombre()
                + "\n - Empresa/institución: " + getEmpresa()
                + "\n - Puesto/Tarea: " + getTarea()
                + "\n - Horas extra: " + getCantidadHorasExtras()
                + "\n - Sueldo: " + calcularSueldo());
    }
    
    public abstract double calcularSueldo();

}
