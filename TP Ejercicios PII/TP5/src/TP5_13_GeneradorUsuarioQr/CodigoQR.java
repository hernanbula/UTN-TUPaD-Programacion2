
package TP5_13_GeneradorUsuarioQr;

/**
 * @author Hernán E. Bula
 */

class CodigoQR {
    
    private String valor;
    private Usuario usuario;
    
    public CodigoQR(String valor) { 
        this.valor = valor;
    }
    
    public void setUsuario(Usuario usuario) { 
        this.usuario = usuario;
        System.out.println("\n------------\nEl usuario " + usuario + " inició sesión correctamente para poder generar el QR.");
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
