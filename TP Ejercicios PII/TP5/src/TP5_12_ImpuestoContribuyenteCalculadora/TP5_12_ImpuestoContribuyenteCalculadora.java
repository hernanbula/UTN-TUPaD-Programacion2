
package TP5_12_ImpuestoContribuyenteCalculadora;

/**
 * @author Hernán E. Bula
 * 
 * 12.​Impuesto - Contribuyente - Calculadora
    a.​Asociación unidireccional: Impuesto → Contribuyente
    b.​Dependencia de uso: Calculadora.calcular(Impuesto)
    Clases y atributos:
        i.​Impuesto: monto.
        ii.​Contribuyente: nombre, cuil.
        iii.​Calculadora->método: void calcular(Impuesto impuesto)
 */

public class TP5_12_ImpuestoContribuyenteCalculadora {

    public static void main(String[] args) {
        
        Impuesto imp1 = new Impuesto(TipoImpuesto.AUTOMOTOR, 1234567.89);
        
        Contribuyente contrib1 = new Contribuyente("Hernán Bula", "1-23456789-0");
        
        imp1.setContribuyente(contrib1);
        
        Calculadora calc1 = new Calculadora();
        
        calc1.calcular(imp1);
        
        System.out.println(imp1);

    } 

}
