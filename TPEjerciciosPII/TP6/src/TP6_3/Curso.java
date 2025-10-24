package TP6_3;

/**
 * @author Hernán E. Bula
 */

class Curso {
    
// Un Profesor dicta muchos Cursos y cada Curso tiene exactamente un Profesor responsable. 
// La relación Profesor-Curso es bidireccional
    
// Atributos:
    private String codigo; // → Código único.
    private String nombre; // → Nombre del curso.
    private Profesor profesor; // → Profesor responsable.

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

// Métodos sugeridos:
    
    // Asigna/cambia el profesor sincronizando ambos lados: Si tenía profesor previo, quitarse de su lista.
    public void setProfesor(Profesor profesor) { 
        // Si es el mismo profesor, no hacer nada
        if (this.profesor == profesor) {
            return;
        }
        // Si tenía un profesor anterior, eliminarlo
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        // Establecer ahora recién el nuevo profesor
        this.profesor = profesor;
        // Añadirse al nuevo curso (si no es nulo)
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }        
    }
    
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void mostrarInfo() { // → Muestra código, nombre y nombre del profesor (si tiene).
        System.out.println("******* C U R S O *******" + "\n - Nombre: \t" + nombre + "\n - Codigo: \t" + codigo + "\n - Profesor: \t" + profesor.getNombre());
    }
    
    // Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nCurso: " + "\n - Nombre: " + nombre + "\n - Codigo: " + codigo;
    }
    
}