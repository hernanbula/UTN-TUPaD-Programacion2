
package TP5_10_CuentaClaveTitular;

/**
 * @author Hernán E. Bula
 * 
 * 10.​CuentaBancaria - ClaveSeguridad - Titular
    a.​ Composición: CuentaBancaria → ClaveSeguridad
    b.​ Asociación bidireccional: CuentaBancaria ↔ Titular
    Clases y atributos:
        i.​CuentaBancaria: cbu, saldo
        ii.​ClaveSeguridad: codigo, ultimaModificacion
        iii.​Titular: nombre, dni.
 */

public class TP5_10_CuentaClaveTitular {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890", 967000,"ABC123", "2025-09-20");
        
        Titular tit1 = new Titular("Hernán Bula", "12345678");
        
        System.out.println(cuenta1);
        
        cuenta1.setTitular(tit1);
        
        System.out.println(cuenta1);
    } 

}
