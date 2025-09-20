
package TP5_4_TarjetaClienteBanco;

/**
 * @author Hernán E. Bula
 */

class Banco {
    
    private String nombre, cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "----------------\nBanco: " + "\n -Nombre: " + nombre + "\n -CUIT: " + cuit;
    }
    
    

}
