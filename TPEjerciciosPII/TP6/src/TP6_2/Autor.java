
package TP6_2;

/**
 * @author Hernán E. Bula
 */

public class Autor {

    // Atributos:
    private String id; // → Identificador único del autor.
    private String nombre; // → Nombre del autor.
    private String nacionalidad;// → Nacionalidad del autor.

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
                    
    // Métodos:
    public void mostrarInfo() { // → Muestra la información del autor en consola.
        System.out.println("-".repeat(40));
        System.out.println("Autor id " + id + "\n - Nombre: " + nombre + "\n - Nacionalidad:" + nacionalidad);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor id " + id + "\n - Nombre: " + nombre + "\n - Nacionalidad: " + nacionalidad + "\n";
    }
    
}
