
package TP5_8_DocumentoFirmaUsuario;

import java.time.LocalDate;

/**
 * @author Hernán E. Bula
 */

public class FirmaDigital {
    
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario;
    private Documento documento;
    private static final LocalDate FECHA_ACTUAL = LocalDate.now(); // aaaa-MM-dd
    
    public FirmaDigital(String codigoHash, String nombre, String email, Documento documento) { 
        this.codigoHash = codigoHash;
        this.fecha = FECHA_ACTUAL;
        this.usuario = new Usuario(nombre, email); // Agregación
        this.documento = documento; // Composición
    }

    @Override
    public String toString() {
        return "\n   DOCUMENTO: " + documento + "\n\n||  Firma Digital || Fecha: " + fecha + " || Usuario: " + usuario + "  || \n||  Codigo Hash: " + codigoHash + "  ||\n";
    }

    
}
