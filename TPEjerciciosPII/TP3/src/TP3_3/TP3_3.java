
package TP3_3;

/**
 *
 * @author Hernán E. Bula
 * 
    3. Encapsulamiento con la Clase Libro
        a. Crear una clase Libro con atributos privados: titulo, autor,año, Publicacion.
        Métodos requeridos: Getters para todos los atributos. Setter con validación para año Publicacion.
        Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
 */

public class TP3_3 {

    public static void main(String[] args) {
    
        Libro lib1 = new Libro();
        
        lib1.getInfoLibro();
        
        lib1.setTitulo("Martín Fierro");
        
        lib1.setAutor("José Hernández");
        
        lib1.setAnioPublicacion(-8);
        
        lib1.setAnioPublicacion(2020);
        
        lib1.getInfoLibro();
        
    
    } // Fin de main

    
} // Fin de Class
