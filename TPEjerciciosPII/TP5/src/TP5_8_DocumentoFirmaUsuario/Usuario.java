
package TP5_8_DocumentoFirmaUsuario;

/**
 * @author Hernán E. Bula
 */

class Usuario {
    
    private String nombre, email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | email: " + email;
    }
    
    

}
