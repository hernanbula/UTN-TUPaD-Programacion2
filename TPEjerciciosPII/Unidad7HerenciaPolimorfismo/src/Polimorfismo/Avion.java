package Polimorfismo;

/**
 * @author Hernán E. Bula
 */
public class Avion extends Vehiculo {

    public void calefaccionarCarburador() {
        System.out.println("Carburador listo.");
    }

    public void regularMezclaCombustible() {
        System.out.println("Mezcla regulada.");
    }

    public void inyectarCombustible() {
        System.out.println("Combustible inyectado.");
    }

    public void masPasos() {
        System.out.println("Muchos pasos mas...");
    }

    @Override
    public void encender() {
        System.out.println(".".repeat(30) + "\nEncendiendo el avión: ");
        calefaccionarCarburador();
        regularMezclaCombustible();
        inyectarCombustible();
        masPasos();
        System.out.println("ENCENDIDO!");
    }

}
