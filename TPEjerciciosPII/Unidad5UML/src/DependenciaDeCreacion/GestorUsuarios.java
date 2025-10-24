package DependenciaDeCreacion;

/**
 *
 * @author Hernán E. Bula
 */
public class GestorUsuarios {

// Dependencia de creación
    public void crearYMostrar(String nombre) {
        // GestorUsuarios crea un usuario
        Usuario user = new Usuario(nombre); // Dependencia de Creación
        // Utiliza el objeto creado
        System.out.println("El usuario creado se llama: " + user.getNombre());
    }

}
