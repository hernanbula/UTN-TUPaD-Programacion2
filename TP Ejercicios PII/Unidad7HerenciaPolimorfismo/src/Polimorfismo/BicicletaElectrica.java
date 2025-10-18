
package Polimorfismo;

/**
 * @author Hernán E. Bula
 */

public class BicicletaElectrica extends Vehiculo {
    
    public void prenderPantalla() {
        System.out.println("Pantalla encendida");
}
    
    public void energizarMotor() {
        System.out.println("Motor listo");
}
    
    @Override
    public void encender() {
        System.out.println(".".repeat(30) + "\nEncendiendo la bicicleta: ");
        prenderPantalla();
        energizarMotor();
        System.out.println("ENCENDIDA!");
    }

}
