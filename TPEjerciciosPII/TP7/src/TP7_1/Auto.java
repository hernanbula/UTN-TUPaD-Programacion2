
package TP7_1;

/**
 * @author Hernán E. Bula
 */

public class Auto extends Vehiculo {
    
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) { 
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" - Tipo: " + this.getClass().getSimpleName());
        System.out.println(" - Cantidad de puertas: " + cantidadPuertas);
    }

}
