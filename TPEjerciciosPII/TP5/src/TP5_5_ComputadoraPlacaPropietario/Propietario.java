package TP5_5_ComputadoraPlacaPropietario;

/**
 * @author Hernán E. Bula
 */
public class Propietario {

    private String nombre, dni;
    private Computadora computadora; // Asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
            System.out.println("----------------\nLa computadora " + getComputadora().getMarca() + ", (n° serie " + getComputadora().getNumeroSerie() +  ") se ha asociado correctamente al propietario " + getNombre() + '.');
        } 
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        if (this.computadora != null) {
            return "----------------\nPropietario: \n -Nombre: " + nombre + "\n -DNI: " + dni + "\n " + computadora;
        } else {
            return "----------------\n" + nombre + ", DNI " + dni + " no es propietario de ninguna computadora. Por favor asocie una para poder continuar.";
        }
    }

}
