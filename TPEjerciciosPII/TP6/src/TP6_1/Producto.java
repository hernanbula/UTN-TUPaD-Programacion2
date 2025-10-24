
package TP6_1;

/**
 * @author Hernán E. Bula
 */

public class Producto {
    
    // Atributos:
    private String id; // → Identificador único del producto.
    private String nombre; // → Nombre del producto.
    private double precio; // → Precio del producto.
    private int cantidad; // → Cantidad en stock.
    private CategoriaProducto categoria; // → Categoría del producto.

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    
//  Métodos:
    public void mostrarInfo() {// → Muestra en consola la información del producto.
        System.out.println("Info producto: "); // FALTA COMPLETAR
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    
    @Override
    public String toString() {
        return "Producto id " + id + "\n* " + nombre + " *\n - Precio: $ \t\t" + precio + "\n - Cantidad: \t\t" + cantidad + "\n - Categoria: \t\t" + categoria;
    }
    
    
}
