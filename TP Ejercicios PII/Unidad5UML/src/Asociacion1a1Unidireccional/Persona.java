
package Asociacion1a1Unidireccional;

/**
 *
 * @author Hernán E. Bula
 */

public class Persona {

    private String nombre;
    private String apellido;
    private Pasaporte pasaporte; // Asociacion 1:1
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    public void mostrarPasaporte() {
        if (pasaporte != null) {
            System.out.println(nombre + " " + apellido + " tiene pasaporte de " + pasaporte.getPais() + ", con número " + pasaporte.getNumero());
        } else {
            System.out.println(nombre + " " + apellido + " NO tiene pasaporte.");   
        }
    }
}
