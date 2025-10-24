
package EjercicioCiminoPOO;

/**
 * @author Hernán E. Bula
 */

public class Posnet {

public static final double RECARGO_CUOTA = 0.03;
public static final int MIN_CUOTAS = 1;
public static final int MAX_CUOTAS = 6;
//private TarjetaCredito tarjetaCredito;
//public int cantCuotas;
//public Ticket tiket; 

public Ticket efectuarPago(TarjetaCredito tarjetaCredito, double montoAbonar, int cantCuotas) {
    
    Ticket elTicket = null;
    
    if(datosValidos(tarjetaCredito, montoAbonar,cantCuotas)) {
        double montoFinal = montoAbonar + (montoAbonar * recargoSegunCuotas(cantCuotas));
        if (tarjetaCredito.tieneSaldoDisponible(montoFinal)) {
            tarjetaCredito.descontarSaldo(montoFinal);
            String nombreCompleto = tarjetaCredito.nombreCompletoTitular();
            double montoCuotas = montoFinal / cantCuotas;
            elTicket = new Ticket(nombreCompleto, montoFinal, cantCuotas, montoCuotas);
        }
    }
    
    return elTicket;
}

    private boolean datosValidos(TarjetaCredito tarjetaCredito,double monto, int cant) {
        boolean esTarjetaValida = tarjetaCredito != null;
        boolean esMontoValido = monto > 0;
        boolean esCantCuotas = cant >= MIN_CUOTAS && cant <= MAX_CUOTAS;
        return (esTarjetaValida && esMontoValido && esCantCuotas);
    }
    
    private double recargoSegunCuotas(int cantCuotas) {
        return ((cantCuotas - 1) * RECARGO_CUOTA);
        }
    }

