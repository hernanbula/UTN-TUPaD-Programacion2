
package TP5_11_ReproductorCancionArtista;

/**
 * @author Hernán E. Bula
 */

class Artista {
    
    private String nombre, genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public String getNombre() { 
        return nombre;
    }

    @Override
    public String toString() {
        return "\n -Artista: " + nombre + "\n -Genero: " + genero + "\n";
    }

    
}
