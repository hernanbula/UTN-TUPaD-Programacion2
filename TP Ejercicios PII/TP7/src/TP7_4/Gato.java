
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override // El metodo abstracto de la superclase hacerSonido() se sobreescribe en esta subclase (polimorfismo)
    public String hacerSonido() {
        return "¡Miau miau!";
    }
}
