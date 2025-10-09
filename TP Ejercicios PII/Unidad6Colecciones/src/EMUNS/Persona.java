
package EMUNS;

/**
 * @author Hernán E. Bula
 */

public class Persona {
    
    private String nombre, dni;
    private NivelEstudio nivelEstudio;
    
    Persona(String nombre, String dni, NivelEstudio nivelEstudio) { 
        this.nombre = nombre;
        this.dni = dni;
        this.nivelEstudio = nivelEstudio;
    }
    
    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", nivelEstudio=" + nivelEstudio + '}';
    }
    

}
