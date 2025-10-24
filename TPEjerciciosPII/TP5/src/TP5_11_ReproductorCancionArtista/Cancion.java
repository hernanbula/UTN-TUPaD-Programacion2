
package TP5_11_ReproductorCancionArtista;

/**
 * @author Hernán E. Bula
 */

class Cancion {
    
    private String titulo;
    private Artista artista;
    
    public Cancion(String titulo) { 
        this.titulo = titulo;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista;
        System.out.println("\nEl artista " + artista.getNombre() + " ha sido asociado a la canción \"" + getTitulo() + "\"");
    }
    
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\n------------------------\nCanción:\n -Título: " + titulo + artista;
    }
    

}
