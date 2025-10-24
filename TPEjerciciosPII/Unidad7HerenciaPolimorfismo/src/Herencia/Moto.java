
package Herencia;

/**
 * @author Hernán E. Bula
 */

public class Moto extends Vehiculo {
    
    private int anchoDeManubrio;

    public Moto(int anchoDeManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }
    
    public void hacerWheelie() { 
        System.out.println(getMarca());
        System.out.println("Haciendo wheelie...");
    }

    @Override
    public String toString() {
        return ".".repeat(40) + "\nMoto" + "\n - Marca: " + this.getMarca() + "\n - Modelo: " + this.getModelo() + "\n - Patente: " + this.getPatente() + "\n - Ancho de manubrio: " + anchoDeManubrio;
    }


}
    
   
