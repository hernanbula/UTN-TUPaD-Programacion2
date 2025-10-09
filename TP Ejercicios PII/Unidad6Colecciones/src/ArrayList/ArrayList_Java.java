
package ArrayList;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */

public class ArrayList_Java {

    public static void main(String[] args) {
        
        Concesionaria cons1 = new Concesionaria("Bula's cars");
        
        cons1.mostrarAutos();
                
        
        Auto a1 = new Auto("ABC-123", "Amarillo", 100000);
        Auto a2 = new Auto("DEF-456", "Rojo", 95000);
        Auto a3 = new Auto("GHI-123", "Blanco", 0);
        Auto a4 = new Auto("DEF-432", "Gris", 0);
        Auto a5 = new Auto("GHI-765", "Negro", 100000);
        
        cons1.agregarAutos(a1);
        cons1.agregarAutos(a2);
        cons1.agregarAutos(a3);
        cons1.agregarAutos(a4);
        cons1.agregarAutos(a5);
        
        cons1.mostrarAutos();
        
        System.out.println("*".repeat(30));


        ArrayList<Auto> misAutos = new ArrayList();
        
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("*".repeat(30));
        
        misAutos.add(a1);
        misAutos.add(a2);
        misAutos.add(a3);
        misAutos.add(a4);
        misAutos.add(a5);
        misAutos.add(new Auto("DEF-567", "Violeta", 100000));
        misAutos.add(new Auto("MNO-789", "Cian", 23455));
        
        System.out.println("El tamaño de la lista es: " + misAutos.size());
        System.out.println("La lista está compuesta de: " + misAutos);
        
        System.out.println("*".repeat(30));
        System.out.println("El 2° auto es: " + misAutos.get(1));
        
        System.out.println("*".repeat(30));
        System.out.println("Mostrando todos los autos de la lista: ");
        
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posición " + i + " es :" + misAutos.get(i));
        }
        
        System.out.println("\n" + "*".repeat(30));
        Auto a = cons1.buscarAuto("DEF-456");
        if (a == null) {
            System.out.println("No se encontró ningun auto con esta patente");
        } else {
            System.out.println("Con esta patente se econtró el siguinete auto: " + a);
        }
        
        System.out.println("\n" + "*".repeat(30));
        a = cons1.buscarAutoConIterador("DEF-456"); 
        if (a == null) {
            System.out.println("No se encontró ningun auto con esta patente");
        } else {
            System.out.println("Con esta patente se econtró el siguinete auto: " + a);
        }
        
        System.out.println("*".repeat(30));
        misAutos.remove(1); // Eliminar por índice
        System.out.println("El tamaño de la lista es: " + misAutos.size()); // Se reduce a dos, se mueven todos para ocupar el espacio vacio y cambia el índice de los elementos.
        System.out.println("La lista está compuesta de: " + misAutos);

        System.out.println("*".repeat(30));
        misAutos.remove(a1); // También se puede remover por nombre
        System.out.println("El tamaño de la lista es: " + misAutos.size());
        System.out.println("La lista está compuesta de: " + misAutos);
        System.out.println("*".repeat(30));
        System.out.println("La lista está vacia?: " + misAutos.isEmpty()); // Devuelve un booleano si la lista está vacia.
        
        misAutos.clear(); // Elimina todos los elementos de la lista
        System.out.println("*".repeat(30));
        System.out.println("La lista está ahora vacia?: " + misAutos.isEmpty());
        
        System.out.println("*".repeat(30));
        System.out.println("Cantidad de autos de la consecionaria: " + cons1.cantidadAutos());
        System.out.println("Kms totales recorridos: " + cons1.sumatoriaKmRecorridos());
        System.out.println("Promedio de Kms recorridos: " + cons1.promedioKmRecorridos());
        
        System.out.println("*".repeat(30));
        System.out.println("Auto con más Kms recorridos: " + cons1.autoMasKm());
        System.out.println("Auto con menos Kms recorridos: " + cons1.autoMenosKm());
        
        System.out.println("*".repeat(30));
        System.out.println("Autos con más Kms recorridos: " + cons1.autosMasKm());
        System.out.println("Autos con más Kms recorridos en un solo for: " + cons1.autosConMasKm());
        System.out.println("Autos con menos Kms recorridos: " + cons1.autosMenosKm());
        System.out.println("Autos con menos Kms recorridos en un solo for: " + cons1.autosConMenosKm());

    
    } 
    

}
