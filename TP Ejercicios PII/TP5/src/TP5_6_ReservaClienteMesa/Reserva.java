
package TP5_6_ReservaClienteMesa;

/**
 * @author Hernán E. Bula
 */

public class Reserva {
    
    private String fecha; // (yyyy-MM-dd)
    private String hora; // (HH-mm)
    private Mesa mesa; // Agregación
    private Cliente cliente; // Asociación unidireccional
    
    public Reserva (String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n-------------------\nReserva: " + "\n -Fecha: " + fecha + "\n -Hora: " + hora + mesa + "\n-------------------\nCliente: " + cliente;
        }

}