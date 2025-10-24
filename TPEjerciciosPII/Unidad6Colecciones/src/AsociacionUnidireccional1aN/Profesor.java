
package AsociacionUnidireccional1aN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Hernán E. Bula
 */

public class Profesor {
    
    private String nombre;
    private List<Curso> cursos = new ArrayList<>(); // Asociacion unidireccional 1 a N -> aquí se instancia directamente

    
    // Constructor
    
    public Profesor(String nombre) { 
        this.nombre = nombre;
    }
    
    // Métodos para gestionar la coleccion (Asociacion unidireccional 1 a N)
    
    public void agregarCurso(Curso curso) { 
        cursos.add(curso);
    }
    
    public void desvincularCurso(Curso curso) { // El curso no se elimina (sigue existiendo), solo se pierde la Asociación con el profesor
        cursos.remove(curso);
    }
    
    public List<Curso> getCurso() { 
        return Collections.unmodifiableList(cursos);
    }
    
    public String getNombre() { 
        return nombre;
    }
    
    public void mostrarCursos() { 
        System.out.println("\n++++++++++++++++++++++++++");
        System.out.println("Los cursos del profesor "
        + nombre + " son:\n");
        for(Curso curso : cursos) {
            System.out.println("---------------------------------");
            System.out.println(curso.getNombre());
            System.out.println("Creditos: " + curso.getCreditos());
        }
        
    }
    

}
