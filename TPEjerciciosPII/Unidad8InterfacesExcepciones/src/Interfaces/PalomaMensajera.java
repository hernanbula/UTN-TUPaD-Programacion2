
package Interfaces;

/**
 * @author Hernán E. Bula
 */

public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

    public PalomaMensajera() {
        super();
        System.out.println("-------------\nPaloma mensajera lista.");
    }
    
    public void volarRapido() { 
        System.out.print("-------------\nVolando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println(" Tirando un papelito que dice mensaje: " + mensaje);
    }

}
