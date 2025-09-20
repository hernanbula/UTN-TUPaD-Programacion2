
package TP5_6_ReservaClienteMesa;

/**
 * @author Hernán E. Bula
 */

class Mesa {
    
    private int numero, capacidad;
    
    public Mesa (int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "\n-------------------\nMesa:" + "\n -Numero: " + numero + "\n -Capacidad: " + capacidad;
    }
}
