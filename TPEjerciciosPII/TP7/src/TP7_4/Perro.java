
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override // El metodo abstracto de la superclase hacerSonido() se sobreescribe en esta subclase (polimorfismo)
    public String hacerSonido() {
        return "¡Guau guau!";
    }
}
