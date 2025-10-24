
package TP4_1;

/**
 *
 * @author Hernán E. Bula
 * 
 * 
Caso Práctico 1
Sistema de Registro de Libros con Editorial

* CLASE LIBRO
    Atributos:
    ● String titulo
    ● String autor
    ● static String editorial (por defecto “Independiente”)

REQUERIMIENTOS
    1. Uso de this:
        ○ Utilizar this en los constructores para distinguir parámetros de atributos.
    2. Encapsulamiento:
        ○ Todos los atributos de la clase deben ser private. Proporcionar los métodos get y set públicos (public) necesarios para acceder o modificar los atributos, excepto aquellos que no deberían ser alterados desde fuera de la clase.
    3. Constructores sobrecargados:
        ○ Uno que reciba título y autor.
        ○ Otro que reciba título, autor y editorial.
    4. Métodos sobrecargados actualizarTitulo:
        ○ Uno que reciba solo el nuevo título.
        ○ Otro que reciba un prefijo y un nuevo título, generando: prefijo + " " + nuevoTitulo.
        ○ Ejemplos de prefijo:
            • "Edición Especial" → Resultado: Edición Especial Cien Años de Soledad
            • "Versión Ilustrada" → Resultado: Versión Ilustrada Rayuela
            • "Colección Juvenil" → Resultado: Colección Juvenil El Principito
            • "Reimpresión 2024" → Resultado: Reimpresión 2024 Don Quijote
    5. Método estático cambiarEditorial(String nueva): modifica la editorial común a todos los libros.
    6. Método toString(): mostrar título, autor y editorial.

* TAREAS A REALIZAR
    1. Crear libros con y sin editorial explícita.
    2. Usar las dos variantes de actualizarTitulo.
    3. Mostrar los libros con toString().
    4. Cambiar la editorial global y volver a mostrar.
* 
 */

public class EjerciciosAdicionalesPOO_1 {

    public static void main(String[] args) {
//      1. Crear libros con y sin editorial explícita.
        Libro l1 = new Libro("Rayuela", "Julio Cortazar");
        Libro l2 = new Libro("100 Años de Soledad", "Gabriel García Márquez", "Siglo XXI");
        Libro l3 = new Libro("El principito", "Antoine de Saint-Exupéry");
        
//      2. Usar las dos variantes de actualizarTitulo.
        l2.actualizarTitulo("Cien Años de Soledad");
        l3.actualizarTitulo("Edición ilustrada", "El principito");
        
//      3. Mostrar los libros con toString().
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        
//      4. Cambiar la editorial global y volver a mostrar.
        Libro.cambiarEditorial("Taurus");
        
        Libro l4 = new Libro("Odorama", "Federico Kukso");
        System.out.println(l4);

    }

}
