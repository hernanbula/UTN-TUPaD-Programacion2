
package Herencia;

/**
 * @author Hernán E. Bula
 */

public class Camion extends Vehiculo {
    
    private int toneladasCarga;

    public Camion(int toneladasCarga, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.toneladasCarga = toneladasCarga;
    }

    @Override
    public String toString() {
        return ".".repeat(40) + "\nCamion" + "\n - Marca: " + this.getMarca() + "\n - Modelo: " + this.getModelo() + "\n - Patente" + this.getPatente() + "\n - Toneladas de carga: " + toneladasCarga + " ton.";
    }


}

