
package TP6_1;

/**
 * @author Hernán E. Bula
 * 
 * 

* Caso Práctico 1

1. Descripción general
    Se debe desarrollar un sistema de stock que permita gestionar productos en
    una tienda, controlando su disponibilidad, precios y categorías. La información se
    modelará utilizando clases, colecciones dinámicas y enumeraciones en Java.
*/

/**

2. Clases a implementar Clase Producto
    Atributos:
        ● id (String) → Identificador único del producto.
        ● nombre (String) → Nombre del producto.
        ● precio (double) → Precio del producto.
        ● cantidad (int) → Cantidad en stock.
        ● categoria (CategoriaProducto) → Categoría del producto.
    Métodos:
        ● mostrarInfo() → Muestra en consola la información del producto.
        
    Enum CategoriaProducto
        Valores:
            ● ALIMENTOS
            ● ELECTRONICA
            ● ROPA
            ● HOGAR

    Método adicional:

        java public enum
        CategoriaProducto {
         ALIMENTOS("Productos comestibles"),
         ELECTRONICA("Dispositivos electrónicos"),
         ROPA("Prendas de vestir"),
        HOGAR("Artículos para el hogar");
        private final String descripcion;
        CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
         }
         public String getDescripcion() {
        return descripcion;
         }
        } 

* Clase Inventario
     Atributo:
        ● ArrayList<Producto> productos 
     Métodos requeridos:
        ● agregarProducto(Producto p)
        ● listarProductos()
        ● buscarProductoPorId(String id)
        ● eliminarProducto(String id)
        ● actualizarStock(String id, int nuevaCantidad)
        ● filtrarPorCategoria(CategoriaProducto categoria)
        ● obtenerTotalStock()
        ● obtenerProductoConMayorStock()
        ● filtrarProductosPorPrecio(double min, double max)
        ● mostrarCategoriasDisponibles()

*/

/*
* 3. Tareas a realizar
    1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
    2. Listar todos los productos mostrando su información y categoría.
    3. Buscar un producto por ID y mostrar su información.
    4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
    5. Eliminar un producto por su ID y listar los productos restantes.
    6. Actualizar el stock de un producto existente.
    7. Mostrar el total de stock disponible.
    8. Obtener y mostrar el producto con mayor stock.
    9. Filtrar productos con precios entre $1000 y $3000.
    10. Mostrar las categorías disponibles con sus descripciones.

* CONCLUSIONES ESPERADAS
● Comprender el uso de this para acceder a atributos de instancia.
● Aplicar constructores sobrecargados para flexibilizar la creación de objetos.
● Implementar métodos con el mismo nombre y distintos parámetros.
● Representar objetos con toString() para mejorar la depuración.
● Diferenciar y aplicar atributos y métodos estáticos en Java. 
● Reforzar el diseño modular y reutilizable mediante el paradigma orientado a objetos. 
 */

public class TP6_1_SistemaStock {

    public static void main(String[] args) {
    //    1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Inventario inventario = new Inventario();
        inventario.listarProductos();
        
        inventario.agregarProducto(new Producto("1001", "Polenta PrestoPonta 1Kg", 1345.25, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1002", "Crema de Leche Sancor 200grs", 2765.25, 55, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1003", "Alfajor Tatin", 800, 250, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("1003", "Leche Milkaut 1L", 1700.90, 30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("2001", "Jarra Eléctrica ATMA", 120000.87, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("2002", "Licuadora ATMA", 230450.50, 20, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("3001", "Plato loza pladur", 8500.99, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("3002", "Vaso durax", 5689.00, 25, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("4001", "Pantalon jean Arquitect", 89999.99, 8, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("4002", "Remera Arquitect", 32450.05, 9, CategoriaProducto.ROPA));
        
    //    2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Listar todos los productos mostrando su información y categoría:");
        inventario.listarProductos();
        
    //    3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Buscar un producto por ID y mostrar su información: ");
        System.out.println("Producto con ID 0001: " + inventario.buscarProductoPorId("0001"));
        System.out.println("Producto con ID 2001: " + inventario.buscarProductoPorId("2001"));
        
    //    4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Filtrar y mostrar productos que pertenezcan a una categoría específica: ");
        System.out.println(inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS));
        
    //    5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Eliminar un producto por su ID y listar los productos restantes: ");
        inventario.eliminarProducto("0001");
        inventario.eliminarProducto("2001");
        inventario.listarProductos();
        
    //    6. Actualizar el stock de un producto existente.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Actualizar el stock de un producto existente.");
        inventario.actualizarStock("1001", 5);
    
    //    7. Mostrar el total de stock disponible.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Mostrar el total de stock disponible");
        System.out.println("El total de stock de los productos del inventario es: " + inventario.obtenerTotalStock());
        
    //    8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Obtener y mostrar el producto con mayor stock");
        System.out.println("El/los producto/s con mayor estock es/son:\n " + inventario.obtenerProductoConMayorStock());
    

    //    9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Filtrar productos con precios entre $1000 y $3000: ");
        
        for (int i = 0; i < (inventario.filtrarProductosPorPrecio(1000, 3000).size()); i++) {
            System.out.println("-".repeat(57));
            System.out.println(inventario.filtrarProductosPorPrecio(1000, 3000).get(i));
        }

    //    10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n" + "+".repeat(40));
        System.out.println("Mostrar las categorías disponibles con sus descripciones.");
        
        CategoriaProducto[] categorias = CategoriaProducto.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.println("-".repeat(50));
            System.out.println("Nombre categoría: " + categorias[i].name() + "\nDescripción: " + categorias[i].getDescripcion());
        }
    }
}
