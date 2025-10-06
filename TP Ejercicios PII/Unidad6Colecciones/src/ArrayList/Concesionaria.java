
package ArrayList;

import java.util.ArrayList;
// import java.util.Collection;

/**
 * @author Hernán E. Bula
 */

public class Concesionaria {
    
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>(); // No olvidar instanciar el ArrayList en el constructor, sino tendremos un "NullPointerException"
    }
    
    public void mostrarAutos() { 
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
//            for (int i = 0; i < autos.size(); i++) { // De esta manera yo debo conocer los métodos de ArrayList u otra Collection
//                System.out.println(autos.get(i));

              for (Auto auto : autos) { // Ciclo FOR EACH. Recorre la colección "autos" y por cada elemento que encuentre lo va a guardar temporalmente en la variable "auto" de tipo "Auto" (ya que Java es fuertemente tipado y tenemos que poner el tipo de dato.
                  System.out.println(auto); // muestra el contenido de "auto" al recorrer cada elemento de la colección "autos"
            }
        }
    }
    
    public void agregarAutos(Auto auto) { 
        this.autos.add(auto);
    }

}
