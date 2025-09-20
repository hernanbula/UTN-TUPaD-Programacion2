
package EjercicioCiminoPOO;

/**
 * @author Hernán E. Bula
 */

public class TarjetaCredito {
    
//  Datos bancarios tarjeta
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldoDisponible;
    private EntidadFinanciera entidadFinanciera;
    private Cliente cliente;

    public TarjetaCredito(String entidadBancaria, String numeroTarjeta, double saldoDisponible, EntidadFinanciera entidadFinanciera, Cliente cliente) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.entidadFinanciera = entidadFinanciera;
        this.cliente = cliente;
    }
    
    public boolean tieneSaldoDisponible(double monto) {
        return saldoDisponible >= monto;
    }
    
    public void descontarSaldo(double monto) {
        saldoDisponible -= monto;
    }
    
    public String nombreCompletoTitular() {
        return cliente.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "entidadBancaria=" + entidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", saldoDisponible=" + saldoDisponible + ", entidadFinanciera=" + entidadFinanciera + ", cliente=" + cliente + '}';
    }
    
    
}
