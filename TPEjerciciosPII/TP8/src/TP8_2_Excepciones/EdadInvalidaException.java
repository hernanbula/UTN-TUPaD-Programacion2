
package TP8_2_Excepciones;

/**
 * @author Hernán E. Bula
 */

public class EdadInvalidaException extends RuntimeException {

    public EdadInvalidaException() {
        System.out.println("La edad ingresada no es válida.");
    }

    public EdadInvalidaException(String message) {
        super(message);
    }

    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdadInvalidaException(Throwable cause) {
        super(cause);
    }


}
