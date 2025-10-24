
package InterfacesEjercicioCimino;

/**
 * @author Hernán E. Bula
 */

public class ExamenOral extends Examen {
    
    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(NivelSatisfaccion nivelSatisfaccion, String fecha) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean aprobo() {
        // return (nivelSatisfaccion != NivelSatisfaccion.INSUFICIENTE); Esto es sencillo porque son pocas opciones. Pero si hubiera más, es mejor usar ordinal.
        return (nivelSatisfaccion.ordinal() >= nivelSatisfaccion.SUFICIENTE.ordinal());
    }
    



}
