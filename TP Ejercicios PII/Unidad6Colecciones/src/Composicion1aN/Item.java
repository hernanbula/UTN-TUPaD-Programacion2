
package Composicion1aN;

/**
 * @author Hernán E. Bula
 */

public class Item {
    
    private String nombre;
    private int cantidad;
    private double precio;

    public Item(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double obtenerSubtotal() { 
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "\n-------------------\nItem:\n - " + nombre + "\n - Cantidad: " + cantidad + "\n - Precio: $ " + precio;
    }
    

}
