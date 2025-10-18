
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public abstract class Animal {
    
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String hacerSonido();
    
    public void describirAnimal() {
        System.out.println("-".repeat(40) + "\nTipo de animal: " + this.getClass().getSimpleName()
        + "\n - Nombre: " + getNombre()
        + "\n - Sonido: " + this.hacerSonido());
    }

    public String getNombre() {
        return nombre;
    }

}
