
package Composicion1a1;

/**
 *
 * @author Hernán E. Bula
 */

public class Libro {
    
    private String titulo;
    private String autor;
    private Portada portada; // Composición 1:1
    
    public Libro(String titulo, String autor, String ilustracion, String tipoTapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.portada = new Portada(ilustracion, tipoTapa);     
    }
    
    public void mostrarPortada() {
        System.out.println("Libro: " + titulo + " de " + autor + ", tiene una portada " + portada.getIlustracion() + " de tipo " + portada.getTipoTapa());
    }

}
