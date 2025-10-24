
package TP8_1_Interfaces;

/**
 * @author Hernán E. Bula
 */

public class PayPal implements Pago, PagoConDescuento {
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("El pago de $" + monto + " con PayPal se ha procesado correctamente.");   
    }

    @Override
    public double aplicarDescuento(double monto, double porcentajeDescuento) {
        return monto + monto * (porcentajeDescuento / 100);
    }

}
