
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Hernán E. Bula
 */

public class Concesionaria {
    
    private String nombre;
    private Collection<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    
    public void mostrarAutos() { 
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
            for (int i = 0; i < autos.size(); i++) {
                System.out.println(autos.get(i));
            }
        }
    }
    
    

}
