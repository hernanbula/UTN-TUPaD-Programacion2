
package TP5_4_TarjetaClienteBanco;

/**
 * @author Hernán E. Bula
 */

class Cliente {
    
    private String nombreApellido, dni;
    private TarjetaCredito tarjetaCredito;
    
    public Cliente(String nombreApellido, String dni) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
    } 

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
        if (tarjetaCredito != null && tarjetaCredito.getCliente() != this) {
            tarjetaCredito.setCliente(this);
            System.out.println("\nEl cliente " + nombreApellido + " fue asociado correctamente a la tarjeta " + tarjetaCredito.getNumero());
        } 
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    @Override
    public String toString() {
        return "----------------\nCliente:\n -Nombre y Apellido: " + nombreApellido + "\n -DNI: " + dni;
    }
    
    

}
