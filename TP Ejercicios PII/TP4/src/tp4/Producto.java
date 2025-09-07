
package tp4;

/**
 *
 * @author Hernán E. Bula

* Caso Práctico 3
Inventario de Productos con IVA

* CLASE PRODUCTO
Atributos:
    ● String nombre
    ● double precioBase
    ● static double IVA (0.21 = 21%)

* REQUERIMIENTOS
    1. Uso de this:
        ○ Utilizar this en los constructores para distinguir parámetros de atributos.
    2. Encapsulamiento:
        ○ Todos los atributos de la clase deben ser private. Proporcionar los métodos get y set públicos (public) necesarios para acceder o modificar los atributos, excepto aquellos que no deberían ser alterados desde fuera de la clase.
    3. Constructores sobrecargados:
        ○ Uno que reciba nombre y precio base.
        ○ Otro que reciba solo el nombre (precio por defecto = 100).
    4. Métodos sobrecargados aplicarDescuento:
        ○ Uno que reciba un porcentaje de descuento.
        ○ Otro que reciba un porcentaje y un precio mínimo, para no bajar de ese valor.
    5. Método calcularPrecioFinal(): retorna el precio con IVA aplicado.
    6. Método estático cambiarIVA(double nuevo): cambia el IVA para todos los productos.
    7. Método toString(): mostrar nombre, precio base y precio final.

* TAREAS A REALIZAR
    1. Crear productos con ambos constructores.
    2. Probar las dos variantes de aplicarDescuento.
    3. Mostrar los productos con toString().
    4. Cambiar el IVA global y recalcular precios finales.
 */

public class Producto {

//  ATRIBUTOS:
    private String nombre;
    private double precioBase;
    private static double IVA = 21; // (0.21 = 21%)
    
//  CONSTRUCTORES:
//  ○ Otro que reciba solo el nombre (precio por defecto = 100).
//  ○ Uno que reciba nombre y precio base.
    
    public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
    public Producto(String nombre){
        this(nombre, 100);
    }
    
    
//  GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    

//  METODOS:
    
//  Métodos sobrecargados aplicarDescuento:
//  ○ Uno que reciba un porcentaje de descuento.
    public void aplicarDescuento(double porcentajeDescuento) {
        setPrecioBase(precioBase * (1 - porcentajeDescuento/100));
    }
    
//  ○ Otro que reciba un porcentaje y un precio mínimo, para no bajar de ese valor.
    public void aplicarDescuento(double porcentajeDescuento, double precioMinimo) {
        double precioConDescuento = precioBase * (1 - porcentajeDescuento/100);
        if(precioConDescuento < precioMinimo) {
            this.setPrecioBase(precioMinimo);
        } else {
            this.setPrecioBase(precioConDescuento);
        }
    }
    
//  Método calcularPrecioFinal(): retorna el precio con IVA aplicado.

    public double calcularPrecioFinal() {
        return precioBase * (1+IVA/100);
    }
    
//  Método estático cambiarIVA(double nuevo): cambia el IVA para todos los productos.
    public static void cambiarIVA(double nuevoIVA) {
        Producto.IVA = nuevoIVA;
    }

//  Método toString(): mostrar nombre, precio base y precio final. 
    @Override
    public String toString() {
        return "\nNombre del producto: " + nombre + "\nPrecio base: " + precioBase + "\nPrecio final: " + this.calcularPrecioFinal();
    }
    

}
