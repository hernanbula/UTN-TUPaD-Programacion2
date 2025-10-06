
package AsociacionBidireccional1aN;

/**
 * @author Hernán E. Bula
 */

public class Empleado {

    private String nombre;
    private String puesto;
    private Departamento departamento;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    // Getters y Setters
    
    public void setDepartamento(Departamento departamento) { 
        // SI es el mismo departamento, no hacer nada
        if (this.departamento == departamento) {
            return;
        }
        // Si tenía un departamento anterior, eliminarse de él
        if (this.departamento != null) {
            this.departamento.eliminarEmpleado(this);
        }
        // Establecer el nuevo deparatamento
        this.departamento = departamento;
        // Añadirse al nuevo departamento (si no es nulo)
        if (departamento != null && !departamento.getEmpleados().contains(this)) {
            departamento.agregarEmpleado(this); 
        }
    }
    
    public Departamento getDepartamento() { 
        return departamento;
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

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", puesto=" + puesto + '}';
    }
    
    
}
