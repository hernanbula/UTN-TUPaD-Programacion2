package TP5_3_LibroAutorEditorial;

import TP5_2_CelularBateriaUsuario.Bateria;

/**
 * @author Hernán E. Bula
 */
public class Libro {

    private String titulo, isbn;
    private Autor autor; // Asociacion 1:1
    private Editorial editorial; // Agregacion 1:1

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarAutor() {
        if (autor != null) {
            System.out.println("El autor del libro \"" + titulo + "\" (ISBN: " + isbn + ") es " + autor.getNombre() + ", de nacionalidad " + autor.getNacionalidad() + '.');
        } else {
            System.out.println("El libro \"" + titulo + "\" (ISBN: " + isbn + "), aun NO tiene cargado su autor.");
        }
    }
}
