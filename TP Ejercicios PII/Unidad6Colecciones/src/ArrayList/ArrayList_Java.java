
package ArrayList;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */

public class ArrayList_Java {

    public static void main(String[] args) {
        
        Concesionaria cons1 = new Concesionaria("Bula's cars");
        
        cons1.mostrarAutos();
        
        Auto a1 = new Auto("ABC123", "Verde");
        // Auto a2 = new Auto("DEF456", "Rojo");
        // Auto a3 = new Auto("GHI789", "Azul");
        
        ArrayList<Auto> misAutos = new ArrayList();
        
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("****************************");
        
        misAutos.add(a1);
        misAutos.add(new Auto("DEF456", "Rojo"));
        misAutos.add(new Auto("GHI789", "Azul"));
        
        System.out.println("El tamaño de la lista es: " + misAutos.size());
        System.out.println("La lista está compuesta de: " + misAutos);
        
        System.out.println("****************************");
        System.out.println("El 2° auto es: " + misAutos.get(1));
        
        System.out.println("****************************");
        System.out.println("Mostrando todos los autos de la lista: ");
        
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posición " + i + " es :" + misAutos.get(i));
        }
        
        System.out.println("****************************");
        misAutos.remove(1); // Eliminar por índice
        System.out.println("El tamaño de la lista es: " + misAutos.size()); // Se reduce a dos, se mueven todos para ocupar el espacio vacio y cambia el índice de los elementos.
        System.out.println("La lista está compuesta de: " + misAutos);

        System.out.println("****************************");
        misAutos.remove(a1); // También se puede remover por nombre
        System.out.println("El tamaño de la lista es: " + misAutos.size());
        System.out.println("La lista está compuesta de: " + misAutos);
    
        System.out.println("La lista está vacia?: " + misAutos.isEmpty()); // Devuelve un booleano si la lista está vacia.
        
        misAutos.clear(); // Elimina todos los elementos de la lista
                      
        System.out.println("La lista está ahora vacia?: " + misAutos.isEmpty());
    
    } 
    

}
