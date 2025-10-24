package TP5_2_CelularBateriaUsuario;

/**
 * @author Hernán E. Bula
 */
public class Usuario {

    private String nombre, dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) { // Evita el bucle infinito y asegura consistencia.
            celular.setUsuario(this);
        }
    }
    
    public void mostrarUsuario() {
        System.out.println("\nEl usuario " + nombre + ", DNI " + dni + " es propietario del siguiente equipo:\n " + celular);
    }
    
    @Override
    public String toString() {
        return "--------------\nUsuario: \n -Nombre: " + nombre + "\n -DNI: " + dni; 
    }
}
