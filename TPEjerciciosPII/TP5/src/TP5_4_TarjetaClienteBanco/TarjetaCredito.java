package TP5_4_TarjetaClienteBanco;

/**
 * @author Hernán E. Bula
 */
public class TarjetaCredito {

    private String numero, fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; // Agregación
    }

    public void setCliente(Cliente cliente) { //  Asociación bidireccional
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaCredito() != this) {
            cliente.setTarjetaCredito(this);
            System.out.println("\nLa tarjeta " + numero + " fue asociada correctamente al cliente " + cliente.getNombreApellido());
        }
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        if (cliente != null) {
        return cliente + "\n" + banco + "\n----------------\nTarjeta de Credito: \n -Numero: " + numero + "\n -Fecha de Vencimiento: " + fechaVencimiento;
        }else{
        return "\nLa Tarjeta de Credito " + numero + ", aun no tiene un cliente asignado. Asigne un cliente.\n" ;         
        }
    }
}
