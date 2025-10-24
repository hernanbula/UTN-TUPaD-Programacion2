
package TP5_3_LibroAutorEditorial;

/**
 * @author Hernán E. Bula
 * 
 * 3. Libro - Autor - Editorial
    a. Asociación unidireccional: Libro → Autor
    b. Agregación: Libro → Editorial
    Clases y atributos:
        i. Libro: titulo, isbn
        ii. Autor: nombre, nacionalidad
        iii. Editorial: nombre, direccion
 */

public class TP5_3_LibroAutorEditorial {

    public static void main(String[] args) {
        
        Editorial ed1 = new Editorial("S.XXI", "Guatemala 4824, CABA, Bs. As., Argentina.");
        Libro lib1 = new Libro("Patas arriba", "978-987-629-510-9", ed1); // Agregacion
        Autor aut1 = new Autor("Eduardo Galeano", "uruguaya");
       
        lib1.mostrarAutor();
        
        lib1.setAutor(aut1); // Asociación unidireccional
        
        lib1.mostrarAutor();
        
        

    } 

}
