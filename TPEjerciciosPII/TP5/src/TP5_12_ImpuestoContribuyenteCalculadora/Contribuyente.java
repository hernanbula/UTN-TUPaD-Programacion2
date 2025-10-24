
package TP5_12_ImpuestoContribuyenteCalculadora;

/**
 * @author Hernán E. Bula
 */

class Contribuyente {
    
    private String nombre, cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "\n------------\nContribuyente:\n -Nombre: " + nombre + "\n -CUIL: " + cuil;
    }
    
    

}
