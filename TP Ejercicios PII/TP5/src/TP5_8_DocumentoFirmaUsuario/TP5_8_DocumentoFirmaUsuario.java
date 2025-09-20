
package TP5_8_DocumentoFirmaUsuario;

/**
 * @author Hernán E. Bula
 * 
 * 8.​ Documento - FirmaDigital - Usuario
    a.​ Composición: Documento → FirmaDigital
    b.​ Agregación: FirmaDigital → Usuario
    Clases y atributos:
        i.​Documento: titulo, contenido
        ii.​FirmaDigital: codigoHash, fecha
        iii.​Usuario: nombre, email
 */

public class TP5_8_DocumentoFirmaUsuario {

    public static void main(String[] args) {
       
        Documento doc1 = new Documento("Contrato final", "Este documento posee el contrato de locación.");
        FirmaDigital firma1 = new FirmaDigital("165d5f1615a80bf0e106df3954c5a73439f659cf02d6c2eb760c21076fb170430", "Hernán Bula", "hebulapa@mail.es.", doc1);
        System.out.println(firma1);

    } 

}
