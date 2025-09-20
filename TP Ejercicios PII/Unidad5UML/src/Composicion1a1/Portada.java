
package Composicion1a1;

/**
 *
 * @author Hernán E. Bula
 */

public class Portada {
    
    private String ilustracion;
    private String tipoTapa;
    
    public Portada(String ilustracion, String tipoTapa) {
        this.ilustracion = ilustracion;
        this.tipoTapa = tipoTapa;
    }

    public String getIlustracion() {
        return ilustracion;
    }

    public void setIlustracion(String ilustracion) {
        this.ilustracion = ilustracion;
    }

    public String getTipoTapa() {
        return tipoTapa;
    }

    public void setTipoTapa(String tipoTapa) {
        this.tipoTapa = tipoTapa;
    }

}
