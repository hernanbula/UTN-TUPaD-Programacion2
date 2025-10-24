package TP7_3;

/**
 * @author Hernán E. Bula
 */
public abstract class Empleado {

    // Atributos
    private String nombre, empresa, tarea;
    private int cantidadHorasExtras;

    // Items del sueldo de un empleado
    private final double SUELDO_BASICO = 900000;
    private final double SALARIO_FAMILIAR = 200000;
    private final double APORTES = SUELDO_BASICO * 0.4;
    private final double HORA_EXTRA = 10000;

    // Constructor
    public Empleado(String nombre, String empresa, String tarea, int cantidadHorasExtras) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.tarea = tarea;
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    // Getters y Setters
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

    // Muestra la info de cada empleado
    public void mostrarInfo() {
        System.out.println(".".repeat(30) + "\nEmpleado: \n - Nombre: " + getNombre()
                + "\n - Empresa/institución: " + getEmpresa()
                + "\n - Puesto/Tarea: " + getTarea()
                + "\n - Horas extra: " + getCantidadHorasExtras()
                + "\n - Sueldo: " + calcularSueldo(this));
    }

    // Calcula el sueldo según el tipo de empleado (Planta o Temporal)
    public double calcularSueldo(Empleado empleado) {
        double sueldoFinal;
        if (empleado instanceof EmpleadoPlanta) {
            sueldoFinal = SUELDO_BASICO + SALARIO_FAMILIAR + APORTES + cantidadHorasExtras * HORA_EXTRA;
        } else if (empleado instanceof EmpleadoTemporal) {
            sueldoFinal = SUELDO_BASICO + cantidadHorasExtras * HORA_EXTRA;
        } else {
            sueldoFinal = 0;
        }
        return sueldoFinal;
    }
}
