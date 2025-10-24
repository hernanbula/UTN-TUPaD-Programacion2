
package Interfaces;

/**
 * @author Hernán E. Bula
 */

public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje {

    public TelefonoMovil() {
        System.out.println("-------------\nTelefono movil creado");
    }
    

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println("Conectando con la API de WhatsApp para enviar un mensaje que dice: " + mensaje);
    }

}
