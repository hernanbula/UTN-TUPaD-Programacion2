
package TP7_4;

/**
 * @author Hernán E. Bula
 */

public abstract class Animal {
    
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String hacerSonido(); // Método abstracto que obliga a sobreescribir en la subclases (polimorfismo)
    
    // Método que imprime las características de cada animal,
    // En su interior contienen el método abstracto hacerSonido() que llama a la versión sobreescrita en las subclases (polimorfismo)
    public void describirAnimal() {
        System.out.println("-".repeat(40) + "\nTipo de animal: " + this.getClass().getSimpleName()
        + "\n - Nombre: " + getNombre()
        + "\n - Sonido: " + this.hacerSonido()); // Aquí se llama a la versión sobreescrita en cada subclases (polimorfismo)
    }

    public String getNombre() {
        return nombre;
    }

}
