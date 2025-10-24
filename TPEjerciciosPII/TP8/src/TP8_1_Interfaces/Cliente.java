
package TP8_1_Interfaces;

/**
 * @author Hernán E. Bula
  *  Crear una interfaz Notificable para notificar cambios de estado. 
 *  La clase Cliente implementa dicha interfaz y Pedido debe notificarlo al cambiar de estado. 
 */

public class Cliente implements Notificable {
    
    private String NombreCliente;
    private String dni;

    public Cliente(String NombreCliente, String dni) {
        this.NombreCliente = NombreCliente;
        this.dni = dni;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Cliente " + NombreCliente + ": " + mensaje);
    }

}
