
package Agregacion1aN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Hernán E. Bula
 */

public class Empresa {
    
    private String nombreEmpresa;
    private List<Empleado> empleados;
    
    // Constructor
    public Empresa(String nombreEmpresa) { 
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>(); // En la Agregación se instancia en el contructor
    }
    
    // Métodos
    public void agregarEmpleado(Empleado empl) { 
        if (empl != null && !empleados.contains(empl)) {
            empleados.add(empl);
            System.out.println("\nSe agregó el empleado " + empl.getNombre() + " correctamente\n");
        } else {
            System.out.println("\nNo se pudo agregar un nuevo empleado. No son datos válidos o ya existe un empleado con esos datos.\n");
        }
    }
    
    public void removerEmpleado(Empleado empl) { 
        if (empl != null && empleados.contains(empl)) {
            empleados.remove(empl);
            System.out.println("\nSe removió el empleado " + empl.getNombre() + " correctamente\n");
        } else {
            System.out.println("\nNo se pudo remover el empleado. No son datos válidos de un empleado o no pertenece a la empresa actualmente.\n");
        }
    }
    
    public List getEmpleados() { 
        return Collections.unmodifiableList(empleados);
    }
    
    // FALTA RESOLVER ESTO
    public void mostrarEmpleados() { 
        System.out.println("La empresa " + nombreEmpresa + " tiene los siguientes empleados: ");
        System.out.println("++++++++++++++++++++++++++++++");
        for(Empleado empl: empleados) {
            System.out.println("Empleado: " + empl.getNombre());
            System.out.println("Puesto: " + empl.getPuesto());
            System.out.println("--------------------------------------"); 
        }
    }
        
}
