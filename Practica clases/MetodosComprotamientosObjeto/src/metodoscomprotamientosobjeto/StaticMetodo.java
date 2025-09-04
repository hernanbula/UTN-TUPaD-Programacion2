
package metodoscomprotamientosobjeto;

public class StaticMetodo {

    public static void main(String[] args) {
        
        Auto a1 = new Auto("ABC123", "Fiat", "Azul", 20000);
        Auto a2 = new Auto("DEF456", "Ford", "Rojo", 25000);
        Auto a3 = new Auto("GHI789", "Honda", "Amarillo", 30000);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("");
        
        System.out.println("Precio de lista: " + a1.getPrecio());
        System.out.println("Precio de lista: " + a2.getPrecio());
        System.out.println("Precio de lista: " + a3.getPrecio());
        System.out.println("");
        
        a1.precioConDescuento();
        a2.precioConDescuento();
        a3.precioConDescuento();
        System.out.println("");

        Auto.setDescuento(20);
        
        a1.precioConDescuento();
        a2.precioConDescuento();
        a3.precioConDescuento();
        System.out.println("");
       
        System.out.println("Total de autos patentados: " + Auto.getContador());
    }

}
