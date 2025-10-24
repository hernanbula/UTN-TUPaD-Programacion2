
package TP8_1_Interfaces;

import EstadoPedido.EstadoPedido;
import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 * Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.
 */

public class Pedido implements Pagable {
    
    ArrayList<Producto> productos;
    
    private Cliente cliente; 
    private EstadoPedido estadoPedido;

    public Pedido(Cliente cliente, EstadoPedido estadoPedido) {
        productos = new ArrayList<>();
        this.cliente = cliente;
        this.estadoPedido = estadoPedido.PENDIENTE;
    }
    
    public void agregarProducto(Producto prod) { 
        productos.add(prod);
        System.out.println("Se agregó al pedido el " + prod);
    }
    
    public void eliminarProducto(Producto prod) { 
        productos.remove(prod);
        System.out.println("Se eliminó del pedido el " + prod);
    }
    
    public void cambiarEstado(EstadoPedido estadoPedido) { 
        this.estadoPedido = estadoPedido;
        if (cliente != null) {
            cliente.notificar("Tu pedido cambió a: " + estadoPedido.name());
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal(); 
        }
        return total;
    }
    
    
    
    // Getters y Setters

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

}
