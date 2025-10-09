
package TP6_2;

/**
 * @author Hernán E. Bula
 * 
Ejercicio 2: Biblioteca y Libros

1. Descripción general
    Se debe desarrollar un sistema para gestionar una biblioteca, en la cual se
    registren los libros disponibles y sus autores. La relación central es de
    composición 1 a N: una Biblioteca contiene múltiples Libros, y cada Libro
    pertenece obligatoriamente a una Biblioteca. Si la Biblioteca se elimina, también se
    eliminan sus Libros.

2. Clases a implementar
    
    Clase Autor
        Atributos:
            • id (String) → Identificador único del autor.
            • nombre (String) → Nombre del autor.
            • nacionalidad (String) → Nacionalidad del autor.
        Métodos:
            • mostrarInfo() → Muestra la información del autor en consola.

    Clase Libro
        Atributos:
            • isbn (String) → Identificador único del libro.
            • titulo (String) → Título del libro.
            • anioPublicacion (int) → Año de publicación.
            • autor (Autor) → Autor del libro.
        Métodos:
            • mostrarInfo() → Muestra título, ISBN, año y autor.

    Clase Biblioteca
        Atributo:
            • String nombre
            • List<Libro> libros → Colección de libros de la biblioteca.
        Métodos requeridos:
            • agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor)
            • listarLibros()
            • buscarLibroPorIsbn(String isbn)
            • eliminarLibro(String isbn)
            • obtenerCantidadLibros()
            • filtrarLibrosPorAnio(int anio)
            • mostrarAutoresDisponibles()

3. Tareas a realizar
    1. Creamos una biblioteca.
    2. Crear al menos tres autores
    3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
    4. Listar todos los libros con su información y la del autor.
    5. Buscar un libro por su ISBN y mostrar su información.
    6. Filtrar y mostrar los libros publicados en un año específico.
    7. Eliminar un libro por su ISBN y listar los libros restantes.
    8. Mostrar la cantidad total de libros en la biblioteca.
    9. Listar todos los autores de los libros disponibles en la biblioteca.

Conclusiones esperadas
    ● Comprender la composición 1 a N entre Biblioteca y Libro.
    ● Reforzar el manejo de colecciones dinámicas (ArrayList).
    ● Practicar el uso de métodos de búsqueda, filtrado y eliminación.
    ● Mejorar la modularidad aplicando el paradigma de programación orientada a objetos.

* 
* 
 */

public class TP6_2_BibliotecaLibros {

    public static void main(String[] args) {
        
//    1. Creamos una biblioteca.
    Biblioteca biblio = new Biblioteca("Franklin Rawson");

//    2. Crear al menos tres autores
    Autor autor1 = new Autor("0001", "Jorge Luis Borges", "Argentina");
    Autor autor2 = new Autor("0002", "Julio Cortázar", "Argentina");
    Autor autor3 = new Autor("0003", "Ernesto Sábato", "Argentina");
    Autor autor4 = new Autor("0004", "Albert Camus", "Francesa");
    Autor autor5 = new Autor("0005", "Sigmund Freud", "Checa");

//    3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca
    biblio.agregarLibro("978-84-206-1933-7", "Ficciones", 1944, autor1);
    biblio.agregarLibro("978-84-350-4018-2", "Rayuela", 1963, autor2);
    biblio.agregarLibro("978-84-376-0494-7", "El túnel", 1948, autor3);
    biblio.agregarLibro("978-84-9759-275-7", "El extranjero", 1942, autor4);
    biblio.agregarLibro("978-84-206-1800-2", "La interpretación de los sueños", 1899, autor5);
    biblio.agregarLibro("978-84-206-1934-4", "El Aleph", 1949, autor1);
    biblio.agregarLibro("978-84-376-0495-4", "Bestiario", 1951, autor2);
    biblio.agregarLibro("978-84-376-0496-1", "Sobre héroes y tumbas", 1961, autor3);
    biblio.agregarLibro("978-84-9759-276-4", "La peste", 1947, autor4);
    biblio.agregarLibro("978-84-206-1801-9", "El malestar en la cultura", 1930, autor5);

//    4. Listar todos los libros con su información y la del autor.
    biblio.listarLibros();

//    5. Buscar un libro por su ISBN y mostrar su información


//    6. Filtrar y mostrar los libros publicados en un año específico


//    7. Eliminar un libro por su ISBN y listar los libros restantes.


//    8. Mostrar la cantidad total de libros en la biblioteca.


//    9. Listar todos los autores de los libros disponibles en la biblioteca.
        

    } 

}
