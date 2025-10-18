
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public class Vaca extends Animal {
    
    public Vaca(String nombre) {
        super(nombre);
    }
    
    @Override
    public String hacerSonido() {
        return "¡Muuuuu muuuuu!";
    }
}
