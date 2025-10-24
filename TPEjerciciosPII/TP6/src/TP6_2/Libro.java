
package TP6_2;

/**
 * @author Hernán E. Bula
 */

public class Libro {

    // Atributos
    private String isbn; // → Identificador único del libro
    private String titulo; // → Título del libro.
    private int anioPublicacion; // → Año de publicación.
    private Autor autor; // → Autor del libro.

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    //Métodos
    public void mostrarInfo() { // → Muestra título, ISBN, año y autor
        System.out.println("Libro: " + titulo + "\n - Año de publicacion: " + anioPublicacion + "\n - ISBN:" + isbn + "\n - Autor: " + autor);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nLibro: " + titulo + "\n - Año de publicacion: " + anioPublicacion + "\n - ISBN:" + isbn + "\n" + autor;
    }

    
      
      
      
}
