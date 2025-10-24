
package Polimorfismo;

/**
 * @author Hernán E. Bula
 */

public class Main_Polimorfismo {

    public static void main(String[] args) {
        probar(new Avion());
        probar(new BicicletaElectrica());
        
    } 
    
    public static void probar(Vehiculo v) { 
        v.encender();
    }

}
