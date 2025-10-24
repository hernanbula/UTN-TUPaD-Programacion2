
package TP8_1_Interfaces;

/**
 * @author Hernán E. Bula
 */

public class TarjetaCredito implements Pago, PagoConDescuento {
    
    private String numeroTarjeta;
    private double porcentajeDescuento;

    @Override
    public void procesarPago(double monto) {
        System.out.println("El pago de $" + monto + " con Tajeta de Crédito se ha procesado correctamente.");   
    }

    @Override
    public double aplicarDescuento(double monto, double porcentajeDescuento) {
        return monto + monto * (porcentajeDescuento / 100);
    }

}
