
package TP7_3;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 * 
 * 3. Empleados y polimorfismo
    ● Clase abstracta: Empleado con método calcularSueldo()
    ● Subclases: EmpleadoPlanta, EmpleadoTemporal
    ● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar 
* 
 */

public class TP7_3 {

    public static void main(String[] args) {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        listaEmpleados.add(new EmpleadoPlanta("Hernán Bula", "UNC", "Docente", 10));
        listaEmpleados.add(new EmpleadoPlanta("Enrique Pappa", "UTN", "NoDocente", 0));
        listaEmpleados.add(new EmpleadoPlanta("Sebastian Raggeso", "CePIA", "Administrativo", 20));
        listaEmpleados.add(new EmpleadoTemporal("Gonzalo Fierro", "Playas UNC", "Playero", 20));
        listaEmpleados.add(new EmpleadoTemporal("Juan Perez", "LimpioQuim", "Servicios generales", 10));
        listaEmpleados.add(new EmpleadoTemporal("Juliana Paez", "Cantina Sube FAUD", "Bartender", 0));
        
        System.out.println("\n" + "+".repeat(30));
        System.out.println("LISTA TOTAL EMPLEADOS");
        for (Empleado empleado : listaEmpleados) {
            empleado.mostrarInfo();
        }
        
        System.out.println("\n" + "+".repeat(30));
        System.out.println("EMPLEADOS DE PLANTA");
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof EmpleadoPlanta) {
                empleado.mostrarInfo();                
            }
        }

        System.out.println("\n" + "+".repeat(30));
        System.out.println("EMPLEADOS TEMPORALES");
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof EmpleadoTemporal) {
                empleado.mostrarInfo();                
            }
        }        

    } 

}
