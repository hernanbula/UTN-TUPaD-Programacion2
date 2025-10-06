
package Agregacion1aN;

/**
 * @author Hernán E. Bula
 */

public class Empleado {
    
    private String nombre;
    private String puesto;
    
    // Constructor
    public Empleado(String nombre, String puesto) { 
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    // Getters y Setters

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
    
    

}
