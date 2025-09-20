
package TP5_6_ReservaClienteMesa;

/**
 * @author Hernán E. Bula
 */

class Cliente {
    
    private String nombre, telefono;
    
    public Cliente (String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n -Nombre:" + nombre + "\n -Telefono:" + telefono;
    }

}
