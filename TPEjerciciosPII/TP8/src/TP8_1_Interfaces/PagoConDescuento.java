
package TP8_1_Interfaces;

/**
 *
 * @author Hernán E. Bula
 * interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal),
 * con métodos procesarPago(double) y aplicarDescuento(double).
 */
public interface PagoConDescuento extends Pago {

    public abstract double aplicarDescuento(double monto, double porcentajeDescuento);
}
