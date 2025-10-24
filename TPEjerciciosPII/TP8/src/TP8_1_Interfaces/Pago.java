
package TP8_1_Interfaces;

/**
 *
 * @author Hernán E. Bula
 * interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal),
 * con métodos procesarPago(double) y aplicarDescuento(double).
 */
public interface Pago {
    
   public abstract void procesarPago(double monto);
    
}
