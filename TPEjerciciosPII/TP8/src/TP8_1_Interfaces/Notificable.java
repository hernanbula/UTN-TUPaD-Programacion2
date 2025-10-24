
package TP8_1_Interfaces;

/**
 * @author Hernán E. Bula
 *  Crear una interfaz Notificable para notificar cambios de estado. 
 *  La clase Cliente implementa dicha interfaz y Pedido debe notificarlo al cambiar de estado. 
 */

public interface Notificable {
    
    public void notificar(String mensaje);
    
}
