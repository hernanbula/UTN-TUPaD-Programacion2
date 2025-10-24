
package InterfacesEjercicioCimino;

/**
 * @author Hernán E. Bula
 */

public class ExamenEscrito extends Examen {
    
    private static final int MIN_NOTA = 0;
    private static final int MAX_NOTA = 10;
    private static final int NOTA_APROB = 6;
    private static final int MAX_DURACION = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        return (nota >= NOTA_APROB && duracion <= MAX_DURACION);
    }
    
    
    
}
