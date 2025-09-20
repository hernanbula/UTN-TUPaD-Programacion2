
package Agregacion1a1;

/**
 * @author Hernán E. Bula
 */

public class Agregacion1a1 {

   
    public static void main(String[] args) {
   
        Motor Turbo170TSI = new Motor("Turbo170TSI", 1.0, "Nafta");
        Auto nivus = new Auto("VolksWagen", "Nivus", Turbo170TSI);
        
        nivus.mostrarMotor();
        
        nivus.setMotor(null);
        
        System.out.println("El motor " + Turbo170TSI.getTipo() + " sigue existiendo.");
        
        nivus.mostrarMotor();
        
    }

}
