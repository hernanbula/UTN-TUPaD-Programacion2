
package TP5_13_GeneradorUsuarioQr;

/**
 * @author Hernán E. Bula
 */

class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) { 
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario); 
        System.out.println("\n------------\nQR creado correctamente con el valor: " + qr.getValor() + "\n");
    }

}
