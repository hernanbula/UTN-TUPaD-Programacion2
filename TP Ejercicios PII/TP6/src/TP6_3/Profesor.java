
package TP6_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hernán E. Bula
 */

public class Profesor {

// Un Profesor dicta muchos Cursos y cada Curso tiene exactamente un Profesor responsable. 
// La relación Profesor-Curso es bidireccional.
    
// Atributos:
    private String id; // → Identificador único.
    private String nombre; // → Nombre completo.
    private String especialidad; // → Área principal.
    private List<Curso> cursos; // → Cursos que dicta.

// Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        cursos = new ArrayList<>();
    }    

// Métodos sugeridos:
    public void agregarCurso(Curso curso) { // → Agrega el curso a su lista si no está y sincroniza el lado del curso.
        if (curso != null && !cursos.contains(curso)) {
        cursos.add(curso); // Mantener consistencia bidireccional
        // Esta verificación evita recursión infinita
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
        System.out.println(Emojis.FLECHAS_HORARIO + " El curso " + curso.getNombre() + " fue asociado al profesor " + nombre);
    }
            
    public void eliminarCurso(Curso c) { // → Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde).
        cursos.remove(c);
    }
            
    public void listarCursosProfesor() {// → Muestra códigos y nombres.
        if (cursos == null) {
            System.out.println("No hay cursos asociados a este profesor.");
        } else {
                System.out.println("***** P R O F E S O R *****" + this.nombre + "\n - Especialidad: " + this.especialidad + "\n - ID: " + this.id + ".".repeat(40) +"\n ----- Cursos asignados ------ " );
            for (Curso curso : cursos) {
                System.out.println("-".repeat(40) + "\n - Nombre del curso: " + curso.getNombre() + "\n - Código: "+ curso.getCodigo() );
            }
        }
    }

    public void mostrarInfo() { // → Imprime datos del profesor y cantidad de cursos.
        System.out.println(".".repeat(40));
        System.out.println("Profesor " + this.nombre + "\n - Especialidad: " + this.especialidad + "\n - ID: " + this.id + "\n - Cantidad de cursos: " + cursos.size());
    }
    
    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
    
    
    
            

}
