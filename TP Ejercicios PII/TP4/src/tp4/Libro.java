
package tp4;

/**
 *
 * @author Hernán E. Bula
 * 
 */
public class Libro {
    
    // ATRIBUTOS:
    
    private String titulo;
    private String autor;
    private String editorial = Libro.editorialClase;
    private static String editorialClase = "Independiente";
    
    // CONSTRUCTORES
    // Constructores sobrecargados:
        
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public Libro(String titulo, String autor) {
        this(titulo, autor, Libro.editorialClase);
    }
    
    // GETTERS Y SETTERS
    
    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor () {
        return autor;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }
    
    // METODOS SOBRECARGADOS
    
//  ○ Uno que reciba solo el nuevo título.
    public void actualizarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }
    
//  ○ Otro que reciba un prefijo y un nuevo título, generando: prefijo + " " + nuevoTitulo.
    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        titulo = prefijo + ": " + nuevoTitulo;
//  ○ Ejemplos de prefijo:
//      • "Edición Especial" → Resultado: Edición Especial Cien Años de Soledad
//      • "Versión Ilustrada" → Resultado: Versión Ilustrada Rayuela
//      • "Colección Juvenil" → Resultado: Colección Juvenil El Principito
//      • "Reimpresión 2024" → Resultado: Reimpresión 2024 Don Quijote
    }
    
//  Método estático cambiarEditorial(String nueva): modifica la editorial común a todos los libros.
    public static void cambiarEditorial(String nuevaEditorial) {
        Libro.editorialClase = nuevaEditorial;
        System.out.println("\nLa editorial por defecto ahora es: " + Libro.editorialClase);
    }
    
//  Método toString(): mostrar título, autor y editorial.
    @Override
    public String toString() {
        return "\nTítlo: " + titulo + "\nAutor: " + autor + "\nEditorial: " + editorial;
    }
    
}