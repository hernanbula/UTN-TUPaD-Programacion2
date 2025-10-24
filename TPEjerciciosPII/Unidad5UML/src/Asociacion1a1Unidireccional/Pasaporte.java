
package Asociacion1a1Unidireccional;

/**
 *
 * @author Hernán E. Bula
 */

public class Pasaporte {

    private String numero;
    private String pais;
    
    public Pasaporte(String numero, String pais) {
        this.numero = numero;
        this.pais = pais;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    

}
