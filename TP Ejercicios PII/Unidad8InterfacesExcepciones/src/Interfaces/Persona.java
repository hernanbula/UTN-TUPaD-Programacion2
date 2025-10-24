
package Interfaces;

/**
 * @author Hernán E. Bula
 */

public class Persona implements EnviadorDeMensaje {
    
    private String nombre;

    public Persona() {
        this.nombre = nombre;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("-------------\nYendo casa por casa a tocar el timbre para decir: " + mensaje);
    }

}
