
package TP5_8_DocumentoFirmaUsuario;

/**
 * @author Hernán E. Bula
 */

class Documento {
    
    private String titulo, contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " | Contenido: " + contenido;
    }
    
    

}
