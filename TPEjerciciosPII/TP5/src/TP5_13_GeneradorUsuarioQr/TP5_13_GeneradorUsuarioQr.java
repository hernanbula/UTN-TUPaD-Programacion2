
package TP5_13_GeneradorUsuarioQr;

/**
 * @author Hernán E. Bula
 * 
 * Dependencia de Creación
    13.​GeneradorQR - Usuario - CódigoQR
    a.​Asociación unidireccional: CódigoQR → Usuario
    b.​Dependencia de creación: GeneradorQR.generar(String, Usuario)
    Clases y atributos:
        i.​CodigoQR: valor.
        ii.​Usuario: nombre, email.
        iii.​GeneradorQR->método: void generar(String valor, Usuario usuario)
 */

public class TP5_13_GeneradorUsuarioQr {

    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Hernán Bula", "mail@mail.com");
        GeneradorQR generator = new GeneradorQR(); // ​Asociación unidireccional
        generator.generar("http://google.com", user1); // ​Dependencia de creación
        

    } 

}
