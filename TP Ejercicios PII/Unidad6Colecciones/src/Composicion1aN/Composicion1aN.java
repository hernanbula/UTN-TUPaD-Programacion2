
package Composicion1aN;

import java.util.Date;

/**
 * @author Hernán E. Bula
 */

public class Composicion1aN {

    public static void main(String[] args) {
        
        // Instanciamos el pedido
        Pedido pedido1 = new Pedido(1001, "Hernán Bula", new Date());
        
        // Agregamos items al pedido
        pedido1.agregarItem("Leche Entera 1L Manfrey", 20, 1820.5);
        pedido1.agregarItem("Queso crema Sancor", 30, 2520.5);
        pedido1.agregarItem("Sal gruesa Celusal", 12, 7320.5);
        pedido1.agregarItem("Chicle Beldent", 68, 320.5);
        pedido1.agregarItem("Fideos Don Felipe", 28, 3320.5);
        
        // Mostramos el pedido
        pedido1.mostrarPedido();
        
        // Removemos un item
        pedido1.eliminarItem("Chicle Beldent");
        
        // Mostramos nuevamente el pedido
        pedido1.mostrarPedido();
        
    }
}
