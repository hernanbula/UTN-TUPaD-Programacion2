
package metodoscomprotamientosobjeto;

public class Auto {

    // ATRIBUTOS
    private static int contador; // Atributo de Clase (static) para contar la cantidad de veces que se crea un objeto (auto) con esta clase. 
    private int numero;
    private String patente;
    private String marca;
    private String color;
    private double precio;
    private static double descuento; // Atributo estático de la Clase
//    private static int numero;

    // CONSTRUCTOR
    
    public Auto(String patente, String marca, String color, double precio) {
        Auto.contador++; // Al crear un auto el contador aumenta 1.
        this.numero = contador; // Se asigna el número del contador (de la clase) para que sea consecutivo
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        Auto.descuento = 5;
    }
    
    // METODOS
    
    @Override
    public String toString() {
        return "Auto{" + "Numero=" + numero + ", patente=" + patente + ", marca=" + marca + ", color=" + color + ", precio=" + precio + '}';
    }
    
    public double precioPromocional() { // Retorna el precio promocional
        return this.precio - this.precio * Auto.descuento / 100;
    }
    
    public void precioConDescuento() { // Imprime precio con descuento
        System.out.println("Precio con " + Auto.getDescuento() + " % de descuento: " + precioPromocional());
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double getDescuento() {
        return descuento;
    }

    public int getNumero() {
        return numero;
    }
    
    public static void setDescuento(double descuento) { // Método de clase que setea el descuento del atributo de la Clase Auto. Método estático: se llama desde la clase, sin necesidad de crear un objeto.
        Auto.descuento = descuento;
    }

    public static int getContador() {
        return Auto.contador;
    }
}
