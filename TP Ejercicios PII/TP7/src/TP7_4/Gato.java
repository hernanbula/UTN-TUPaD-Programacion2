
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public String hacerSonido() {
        return "¡Miau miau!";
    }
}
