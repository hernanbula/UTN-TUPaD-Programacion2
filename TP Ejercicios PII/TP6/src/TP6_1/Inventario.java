package TP6_1;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */

public class Inventario {
    
    // Atributos:
    private ArrayList<Producto> productos;
    
    // Constructor

    public Inventario() {
        productos = new ArrayList<Producto>();
    }
    
    // Métodos:
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
     
    public void eliminarProducto(String id) {
        if (buscarProductoPorId(id) != null) {
        productos.remove(buscarProductoPorId(id));
        System.out.println("El producto id " + id + " fue elimnado correctamente.");
        } else {
        System.out.println("No existe un producto con id " + id);
        }
    }
     
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto prod : productos) { 
            System.out.println("-".repeat(50));
            System.out.println("Producto id " + prod.getId() + "\n* " + prod.getNombre() + " *\n  - Precio: $ " + prod.getPrecio() + "\n  - Cantidad: " + prod.getCantidad() + "\n  - Categoria: " + prod.getCategoria());
            }
        }
    }
    
    public int cantidadProductos() { 
        return productos.size();
    }
     
    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        int i = 0;
        while (i < cantidadProductos() && !productos.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        if (i < cantidadProductos()) { 
            productoEncontrado = this.productos.get(i);
        }
        return productoEncontrado;
    }
        
    public void actualizarStock(String id, int nuevaCantidad) {
        nuevaCantidad += buscarProductoPorId(id).getCantidad();
        buscarProductoPorId(id).setCantidad(nuevaCantidad);
        System.out.println("El stock actual del producto " + id + " es: " + nuevaCantidad);
    }
     
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> listaPorCateg = new ArrayList<>();
        for (Producto prod : productos) {
            if (categoria != null && categoria.equals(prod.getCategoria())) {
                listaPorCateg.add(prod);
            }
        }
        return listaPorCateg;
    }
     
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }
     
    public ArrayList<Producto> obtenerProductoConMayorStock() {
        ArrayList<Producto> listaMayorStock = new ArrayList<>();
        double masStock = 0;
        for (Producto prod : productos) {
            if (prod.getCantidad() == masStock) {
                listaMayorStock.add(prod);
            } else if (prod.getCantidad()> masStock) {
                masStock = prod.getCantidad();
                listaMayorStock.clear();
                listaMayorStock.add(prod);
            }
        }
        return listaMayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> listaPreciosMinMax = new ArrayList<>();
        for (Producto prod : productos) {
            if (prod.getPrecio() > min && prod.getPrecio() < max) {
                listaPreciosMinMax.add(prod);
            }
        }
        return listaPreciosMinMax;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println(CategoriaProducto.values());
    }

}
