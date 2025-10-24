
package InterfacesEjercicioCimino;

/**
 * @author Hernán E. Bula
 */

public abstract class Examen implements Aprobable {
    
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }
    
}
