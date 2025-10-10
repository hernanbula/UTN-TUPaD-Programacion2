
package TP6_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hernán E. Bula
 */

public class Biblioteca {
    
    // Atributos
    private String nombre;
    private List<Libro> libros; // → Colección de libros de la biblioteca

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    // Métodos requeridos
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay aun libros en el inventario de la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println("-".repeat(50));
                System.out.println("Libro: " + libro.getTitulo() + "\n - Año de publicacion: " + libro.getAnioPublicacion() + "\n - ISBN: " + libro.getIsbn() + "\n" + libro.getAutor());
            }
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        int i = 0;
        while (i < obtenerCantidadLibros() && !libros.get(i).getIsbn().equalsIgnoreCase(isbn) ) {
            i++;
        }
        if (i < obtenerCantidadLibros()) {
            libroEncontrado = this.libros.get(i);
        }
        return libroEncontrado;
    }

    public void eliminarLibro(String isbn) {
        Libro lib = buscarLibroPorIsbn(isbn);
        if (lib == null) { 
            System.out.println("\nNo se encontró un libro con ese ISBN.\n");
        } else {
            System.out.println("\nSe removió correctamente el siguiente libro\n: " + lib);
            libros.remove(lib);
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> listaLibrosAnio = new ArrayList<>();
        for (Libro libro : libros) { 
            if (libro.getAnioPublicacion() == anio) {
                listaLibrosAnio.add(libro);
            }
        }
        return listaLibrosAnio;
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("\n****** AUTORES ******\n");
        for (Libro libro : libros) {
            System.out.println("+ " + libro.getAutor().getNombre());
        }
    }

}
