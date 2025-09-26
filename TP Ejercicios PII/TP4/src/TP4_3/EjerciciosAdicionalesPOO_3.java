package TP4_3;

/**
 *
 * @author Hernán E. Bula
 *
 * Caso Práctico 3 Inventario de Productos con IVA
 *
 * CLASE PRODUCTO Atributos: ● String nombre ● double precioBase ● static double
 * IVA (0.21 = 21%)
 *
 * REQUERIMIENTOS 1. Uso de this: ○ Utilizar this en los constructores para
 * distinguir parámetros de atributos. 2. Encapsulamiento: ○ Todos los atributos
 * de la clase deben ser private. Proporcionar los métodos get y set públicos
 * (public) necesarios para acceder o modificar los atributos, excepto aquellos
 * que no deberían ser alterados desde fuera de la clase. 3. Constructores
 * sobrecargados: ○ Uno que reciba nombre y precio base. ○ Otro que reciba solo
 * el nombre (precio por defecto = 100). 4. Métodos sobrecargados
 * aplicarDescuento: ○ Uno que reciba un porcentaje de descuento. ○ Otro que
 * reciba un porcentaje y un precio mínimo, para no bajar de ese valor. 5.
 * Método calcularPrecioFinal(): retorna el precio con IVA aplicado. 6. Método
 * estático cambiarIVA(double nuevo): cambia el IVA para todos los productos. 7.
 * Método toString(): mostrar nombre, precio base y precio final.
 *
 * TAREAS A REALIZAR 1. Crear productos con ambos constructores. 2. Probar las
 * dos variantes de aplicarDescuento. 3. Mostrar los productos con toString().
 * 4. Cambiar el IVA global y recalcular precios finales.
 */
public class EjerciciosAdicionalesPOO_3 {
    
    public static void main(String[] args) {

//    1. Crear productos con ambos constructores.
        Producto prod1 = new Producto("Lata atun \"La Campagnola\"", 3956.99);
        Producto prod2 = new Producto("Harina 0000 \"Graciela Real\"", 1240.5);
        Producto prod3 = new Producto("Salsa de tomate 1L \"Arcor\"", 2890.99);
        Producto prod4 = new Producto("Chicle \"Bubaloo\"");
        Producto prod5 = new Producto("Caramelo \"Sugus\"");
        
        System.out.println("\nPRECIOS DE LISTA:");
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        System.out.println(prod5);

//    2. Probar las dos variantes de aplicarDescuento.
        System.out.println("\nPRECIOS CON DESCUENTO:");
        prod1.aplicarDescuento(50, 2000);
        prod2.aplicarDescuento(15);
        prod3.aplicarDescuento(50, 1500);
        prod4.aplicarDescuento(5);
        prod5.aplicarDescuento(5);

//    3. Mostrar los productos con toString().
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        System.out.println(prod5);

//    4. Cambiar el IVA global y recalcular precios finales.  
        Producto.cambiarIVA(15);
        System.out.println("\nPRECIOS CON IVA AL %15");
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        System.out.println(prod5);
    }
    
}
