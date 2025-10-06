package TP4_0b;

import java.util.Scanner;

/**
 * @author Hernán E. Bula
 *
 * * CLASE EMPLEADO
    Atributos:
    - int id: Identificador único del empleado.
    - String nombre: Nombre completo.
    - String puesto: Cargo que desempeña.
    - double salario: Salario actual.
    - static int totalEmpleados: Contador global de empleados creados.​

* REQUERIMIENTOS
    1.​ Uso de this:
        ○​ Utilizar this en los constructores para distinguir parámetros de atributos.
    2.​ Constructores sobrecargados:
        ○​ Uno que reciba todos los atributos como parámetros.
        ○​ Otro que reciba solo nombre y puesto, asignando un id automático y un salario por defecto.
        ○​ Ambos deben incrementar totalEmpleados.
    3.​ Métodos sobrecargados actualizarSalario:
        ○​ Uno que reciba un porcentaje de aumento.
        ○​ Otro que reciba una cantidad fija a aumentar.
    4.​ Método toString():
        ○​ Mostrar id, nombre, puesto y salario de forma legible.
    5.​ Método estático mostrarTotalEmpleados():
        ○​ Retornar el total de empleados creados hasta el momento.
 *
 */
class Empleado {
    
    Scanner input = new Scanner(System.in);

    private int id = 0; // Identificador único del empleado.
    private String nombre; // Nombre completo.
    private String puesto; // Cargo que desempeña.
    private double salario; // Salario actual.
    private static final double SALARIO_FIJO = 1000000; // Salario actual.
    private static int totalEmpleados = 0; // Contador global de empleados creados.​

    // Constructores sobrecargados
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados ++;
    }

    public Empleado(String nombre, String puesto) {
        this((Empleado.totalEmpleados+1), nombre, puesto, SALARIO_FIJO);
    }
    
    // Métodos
    
    public void actualizarSalario(int montoFijo) { 
        this.salario = salario + montoFijo;
        System.out.println("\n ⭮ Salario actualizado por monto fijo (+ $ " + montoFijo + ").\n 🡆 Total =  $ " + salario);
    }
    
    public void actualizarSalario(double porcentaje) { 
        this.salario = salario + (salario * porcentaje / 100);   
        System.out.println("\n ⭮ Salario actualizado por porcentaje (+ % " + porcentaje + ").\n 🡆 Total =  $ " + salario);
    }
    
    public static int mostrarTotalEmpleados() { 
        return Empleado.totalEmpleados;
    }
    
    // Getters + Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() { 
        return "\n" + "-".repeat(47) + "\n 🔅EMPLEADO (Nro Id " + id + ")\n - Nombre: \t" + nombre + "\n - Puesto: \t" + puesto + "\n - Salario: \t" + salario;
    }

}
