
package Composicion1aN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Hernán E. Bula
 */

public class Pedido {
    
    private int codigo;
    private String cliente;
    private Date fecha;
    private List<Item> items;
    
    
    // Constructor

        public Pedido(int codigo, String cliente, Date fecha) {
            this.codigo = codigo;
            this.cliente = cliente;
            this.fecha = fecha;
            items = new ArrayList<>();
        }
 

    // Métodos
    public void agregarItem(String nombre, int cantidad, double precio) { 
        items.add(new Item(nombre, cantidad, precio));
        System.out.println("-".repeat(49)
                + "\nItem agregado:\n - " + nombre + "\n - Cantidad: " + cantidad + "\n - Precio: $ " + precio);
    }
    
    public boolean eliminarItem(String nombreItem) {
        for (Item item : items) { 
            if (item.getNombre().equals(nombreItem)) {
                items.remove(item);
                System.out.println("\nSe eliminó el item " + item.getNombre() + ".\n");       
                return true;
            }
        }
        System.out.println("\nNo se pudo eliminar el item " + nombreItem + ".\n");       
        return false;
    }
    
    public double calcularTotal() { 
        double total = 0;
        for (Item item : items) { 
            total += item.obtenerSubtotal();
        }
        return total;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void mostrarPedido() { 
        String lineaMas = "\n" + "+".repeat(23) + "\n"; // Linea de signos mas (+++++++++++++++++++++++)
        String lineaGuion = "-".repeat(49) + "\n"; // Linea de lineaGuion (-------------------------------------------------)
        
        System.out.println(lineaMas + "PEDIDO:\nCódigo: " + codigo + "\nCliente: " + cliente + "\nFecha: " + fecha 
                + lineaMas
                + lineaGuion
                + "                         ITEMS                         ");
        for (Item item : getItems()) {
            System.out.println(lineaGuion + "* " + item.getNombre() + "\n - Cantidad: " + item.getCantidad() + "\n - Precio: $ " + item.getPrecio() + "\n - Subtotal: $ " + item.obtenerSubtotal());
        }
        System.out.println(lineaGuion
        + lineaMas
        + "\n TOTAL: \t         $ " + calcularTotal()
        + "\n" + lineaGuion);
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", cliente=" + cliente + ", fecha=" + fecha + ", items=" + items + '}';
    }

}
