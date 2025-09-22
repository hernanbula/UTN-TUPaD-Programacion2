
package TP5_12_ImpuestoContribuyenteCalculadora;

/**
 * @author Hernán E. Bula
 */

public class Impuesto {
    
    private TipoImpuesto tipo;
    private double monto;
    private Contribuyente contribuyente;
    public Impuesto(TipoImpuesto tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }
    
    public void setContribuyente(Contribuyente contribuyente) { 
        this.contribuyente = contribuyente;
        System.out.println("\n------------\nSe ha asociado correctamente el contribuyente con el impuesto correspondiente a pagar.");
    }
    

    @Override
    public String toString() {
        return "\n------------\n -Impuesto:\n -Tipo: " + tipo + "\n -Monto: " + monto + contribuyente;
    }

}
