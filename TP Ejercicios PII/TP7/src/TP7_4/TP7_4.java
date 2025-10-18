
package TP7_4;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 * 
 * 4. Animales y comportamiento sobrescrito
    ● Clase: Animal con método hacerSonido() y describirAnimal()
    ● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
    ● Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo 
* 
 */

public class TP7_4 {

    public static void main(String[] args) {
        
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        
        listaAnimales.add(new Perro("Boby"));
        listaAnimales.add(new Gato("Cancan"));
        listaAnimales.add(new Vaca("Lola"));
        listaAnimales.add(new Gato("Flora"));
        listaAnimales.add(new Vaca("Jacinta"));
        listaAnimales.add(new Perro("Bemba"));
        
        System.out.println("+".repeat(19) 
                + "\n          LISTA ANIMALES\n"
                + "+".repeat(19));
        for (Animal animal : listaAnimales) {
            animal.describirAnimal();  
        }
    }

}
