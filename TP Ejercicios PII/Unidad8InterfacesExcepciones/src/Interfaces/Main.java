
package Interfaces;

/**
 * @author Hernán E. Bula
 */

public class Main {

    public static void main(String[] args) {

        PartidoDelBuenCodigo partido = new PartidoDelBuenCodigo();
        
        partido.agregarMensajero(new PalomaMensajera());
        partido.agregarMensajero(new TelefonoMovil());
        partido.agregarMensajero(new PalomaMensajera());
        partido.agregarMensajero(new TelefonoMovil());
        partido.agregarMensajero(new Persona());
       
        partido.hacerCampania();
        
        
    } 

}
