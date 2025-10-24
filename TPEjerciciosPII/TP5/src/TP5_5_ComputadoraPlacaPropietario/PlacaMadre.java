
package TP5_5_ComputadoraPlacaPropietario;

/**
 * @author Hernán E. Bula
 */

class PlacaMadre {
    
    private String modelo, chipset;
    
    public PlacaMadre(String modelo, String chipset) { 
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "----------------\nPlaca Madre: \n -Modelo: " + modelo + "\n -Chipset: " + chipset;
    }
    
    

}
