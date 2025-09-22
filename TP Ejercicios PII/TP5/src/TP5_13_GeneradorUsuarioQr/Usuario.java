
package TP5_13_GeneradorUsuarioQr;

/**
 * @author Hernán E. Bula
 */

class Usuario {
    
    private String nombre, email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (email: " + email + ')';
    }
}
