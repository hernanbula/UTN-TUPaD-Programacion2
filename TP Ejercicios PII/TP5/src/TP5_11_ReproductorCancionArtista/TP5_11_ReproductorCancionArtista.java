
package TP5_11_ReproductorCancionArtista;

/**
 * @author Hernán E. Bula
 * 
 * Dependencia de Uso
    11.​Reproductor - Canción - Artista
    a.​Asociación unidireccional: Canción → Artista
    b.​Dependencia de uso: Reproductor.reproducir(Cancion)
    Clases y atributos:
        i.​Canción: titulo.
        ii.​Artista: nombre, genero.
        iii.​Reproductor->método: void reproducir(Cancion cancion)
 */

public class TP5_11_ReproductorCancionArtista {

    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion("Narigon del siglo");
        
        Artista art1 = new Artista("Divididos", "Rock");
        
        cancion1.setArtista(art1); // ​Asociación unidireccional
                
        Reproductor rep1 = new Reproductor();  
        
        rep1.reproducir(cancion1); // Dependencia de uso

    } 

}
