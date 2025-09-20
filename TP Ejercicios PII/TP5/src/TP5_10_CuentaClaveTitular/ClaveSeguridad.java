
package TP5_10_CuentaClaveTitular;

/**
 * @author Hernán E. Bula
 */

class ClaveSeguridad {

    private String codigo, ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "\n--------------\nClave Seguridad: " + "\n -Codigo:" + codigo + "\n -Última modificacion: " + ultimaModificacion;
    }
    
    
}
