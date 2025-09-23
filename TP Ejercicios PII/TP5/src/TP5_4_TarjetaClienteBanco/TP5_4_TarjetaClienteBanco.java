
package TP5_4_TarjetaClienteBanco;

/**
 * @author Hernán E. Bula
 * 
 * 4.​ TarjetaDeCrédito - Cliente - Banco
    a.​ Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
    b.​ Agregación: TarjetaDeCrédito → Banco
    Clases y atributos:
        i. TarjetaDeCrédito: numero, fechaVencimiento
        ii. Cliente: nombre, dni
        iii.​ Banco: nombre, cuit
* 
 */

public class TP5_4_TarjetaClienteBanco {

    public static void main(String[] args) {
        
        Banco banco1 = new Banco("BNA", "1-23456789-0");
        Cliente cliente1 = new Cliente("Hernán Bula", "1234567");
        TarjetaCredito tarjeta1 = new TarjetaCredito("1234 5678 9000","2030-09-19", banco1); // Agregación
        
        System.out.println(tarjeta1);

        System.out.println(cliente1);
        
        cliente1.setTarjetaCredito(tarjeta1); //  Asociación bidireccional

        tarjeta1.setCliente(cliente1); //  Asociación bidireccional. Como en la linea anterior ya fue asociada la tarjeta al cliente, en esta linea no se hace nada. Pero es para asegurar que no se genera un bucle infinito.

        System.out.println(tarjeta1);
    } 

}
