
package TP5_1_PasaporteFotoTitular;

/**
 * @author Hernán E. Bula
 */

public class Foto {

    private String imagen; // URL
    private String formato; // tipo de archivo
    private Titular titular; // Datos de la persona
    
    public Foto (String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public String getImagen() {
        return imagen;
    }
    
    public void setImagen(String urlImagen) {
        this.imagen = urlImagen;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "--------------\n" + "Foto: \n -Imagen: " + imagen + "\n -Formato: " + formato + "\n";
    }    
    

}
