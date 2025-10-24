
package EjercicioCiminoPOO;

/**
 * @author Hernán E. Bula
 */

public class Cliente {

// Datos cliente
    private String nombre, apellido, DNI, telefono,mail;
    
    
    public Cliente(String nombre, String apellido, String DNI, String telefono, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + nombre + " " + apellido + ", DNI:" + DNI + '}';
    }
    
    
}
