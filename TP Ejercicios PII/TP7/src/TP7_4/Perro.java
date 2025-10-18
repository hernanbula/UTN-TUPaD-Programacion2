
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
        boolean esMascota = true;
    }
    
    @Override
    public String hacerSonido() {
        return "¡Guau guau!";
    }
}
