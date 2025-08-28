
package tp3;

/**
 *
 * @author Hernán E. Bula
 * 
    3. Encapsulamiento con la Clase Libro
        a. Crear una clase Libro con atributos privados: titulo, autor,anioPublicacion.
        Métodos requeridos: Getters para todos los atributos. Setter con validación para año Publicacion.
        Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
 */

public class Libro {

    private String titulo, autor;
    private int anioPublicacion;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion>0) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("El año ingresado es inválido. Tiene que ser un número positivo.\n");
        }   
    }
    
    public void getInfoLibro() {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println();
    }
    
}
