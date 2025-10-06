
package AsociacionBidireccional1aN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Hernán E. Bula
 */

public class Departamento {
    
    private String tipo;
    private List<Empleado> empleados = new ArrayList<>();;
    
    // Constructor
    public Departamento(String tipo) {
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos
    
    // Método crítico para mantener la coherencia bidireccional
    public void agregarEmpleado(Empleado empl) { 
        if (empl!= null && !empleados.contains(empl)) {
        empleados.add(empl); // Mantener consistencia bidireccional
        // Esta verificación evita recursión infinita
        if (empl.getDepartamento() != this) {
            empl.setDepartamento(this);
        }
        }
        System.out.println("El empleado " + empl.getNombre() + " fue asociado al Departamento " + tipo);
    }

    public void eliminarEmpleado(Empleado empl) { 
        if (empl != null && empleados.contains(empl)) {
            empleados.remove(empl);
            // Mantener consistencia bidireccional
            if (empl.getDepartamento() == this) {
                empl.setDepartamento(null);
            }
        }
        System.out.println("El empleado " + empl.getNombre() + " fue eliminado del Departamento " + tipo);
    }
    
    public List<Empleado> getEmpleados() { 
        return Collections.unmodifiableList(empleados);
    }

    @Override
    public String toString() {
        return "Departamento{" + "tipo=" + tipo + ", empleados=" + empleados + '}';
    }
}
