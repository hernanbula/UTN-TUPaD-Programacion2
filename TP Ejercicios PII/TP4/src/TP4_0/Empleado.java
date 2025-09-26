
package TP4_0;

/**
 * @author Hernán Bula

 */
public class Empleado {

    // ATRIBUTOS:
    
    private int id; // Identificador único del empleado.
    private String nombre; // Nombre completo.
    private String puesto; // Cargo que desempeña.
    private double salario; // Salario actual.
    private final static double SALARIO_FIJO = 2000.0;
    private static int totalEmpleados = 0; // Contador global de empleados creados.​
    
    // CONSTRUCTORES
    //  2.​ Constructores sobrecargados:
    
    //      ○​ Uno que reciba todos los atributos como parámetros.

    public Empleado(int id, String nombre, String puesto, double salario) {
        Empleado.totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    //      ○​ Otro que reciba solo nombre y puesto, asignando un id automático y un salario por defecto.
        
    public Empleado(String nombre, String puesto) {
        this(Empleado.totalEmpleados, nombre, puesto, SALARIO_FIJO);
    }
    
    @Override
    public String toString() { // Método toString(): Muestra id, nombre, puesto y salario de forma legible.
        return "Empleado: ID = " + id + ". Nombre = " + nombre + ". Puesto = " + puesto + ". Salario = " +  salario + ".\n";
    }

    public static int mostrarTotalEmpleados() { // Retornar el total de empleados creados hasta el momento.
        System.out.println("El total de empleados es: " + totalEmpleados);
        return totalEmpleados;
    }

    public double actualizarSalario(int porcentajeAumento) { // Calcula el salario con un porcentaje de aumento.
        return salario + (salario * porcentajeAumento / 100);
    }
    
    public double actualizarSalario(double montoAumento) { // Calcula el salario con una cantidad fija a aumentar.
        return salario + montoAumento;
    }

}

