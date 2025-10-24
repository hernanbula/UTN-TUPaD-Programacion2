
package Interfaces;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */

public class PartidoDelBuenCodigo {
    private ArrayList<EnviadorDeMensaje> mensajeros;

    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }
    
    public void agregarMensajero(EnviadorDeMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }
    
    public void hacerCampania() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Hola mundo. Vote por nosotros");
        }
    }
    

}
