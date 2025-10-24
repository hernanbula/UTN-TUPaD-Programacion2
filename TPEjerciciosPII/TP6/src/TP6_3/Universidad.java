package TP6_3;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */
public class Universidad {

// La clase Universidad que administra el alta/baja y consulta de profesores y cursos.
// Atributos:
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

// Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

// Métodos requeridos:
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) { // → Usa setProfesor del curso.
        Profesor profe = buscarProfesorPorId(idProfesor); // Busca el profesor
        Curso curso = buscarCursoPorCodigo(codigoCurso); // Busca el curso
        curso.setProfesor(profe); // Asigna el profesor al curso
        // Otra forma más sintética pero menos clara sería: 
        //      buscarCursoPorCodigo(codigoCurso).setProfesor(buscarProfesorPorId(idProfesor));

    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores para listar.");
        } else {
            for (Profesor profesor : profesores) {
                System.out.println("-".repeat(50));
                System.out.println("Profesor 🆔 " + profesor.getId() + "\n - Nombre: " + profesor.getNombre() + "\n - Especialidad: " + profesor.getEspecialidad() + "\n" + profesor.getCursos());
            }
        }

    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos para listar.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("-".repeat(50));
                System.out.println("* CURSO *" + "\n - Codigo: " + curso.getCodigo() + "\n - Nombre: " + curso.getNombre());
                if (curso.getProfesor() != null) {
                    System.out.println(" - Profesor: " + curso.getProfesor().getNombre());
                } else {
                    System.out.println("Este curso no tiene profesor asignado.");
                }
            }
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor profeId = null;
        int i = 0;
        while (i < profesores.size() && !profesores.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        if (i < profesores.size()) {
            profeId = this.profesores.get(i);
        }
        return profeId;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoPorCodigo = null;
        int i = 0;
        while (i < cursos.size() && !cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
            i++;
        }
        if (i < cursos.size()) {
            cursoPorCodigo = this.cursos.get(i);
        }
        return cursoPorCodigo;
    }

    public void eliminarCurso(String codigo) { // → Debe romper la relación con su profesor si la hubiera.
        Curso cursoEliminar = buscarCursoPorCodigo(codigo);
        if (cursoEliminar != null) {
            // Obtener el profesor del curso antes de romper la relación
            Profesor profesorDelCurso = cursoEliminar.getProfesor(); // Guardar referencia ANTES de setear a null
            // Si el curso tiene un profesor, remover el curso de la lista de cursos del profesor
            if (profesorDelCurso != null) {
                profesorDelCurso.getCursos().remove(cursoEliminar);
            }
            // Luego, remover el curso de la lista de cursos de la universidad
            cursoEliminar.setProfesor(null);
            cursos.remove(cursoEliminar);
        }
    }

    // BUUU NO ESTÁ FUNCIONANDO EL METODO
//    public void eliminarProfesor(String id) { // → Antes de remover, dejar null los cursos que dictaba.
//        Profesor profesorEliminar = buscarProfesorPorId(id);
//        profesorEliminar.setCursos(null);
//        profesores.remove(profesorEliminar);
//    }
    public void eliminarProfesor(String id) { // SOLUCIONADO CON AYUDA DE IA
        Profesor profesorEliminar = buscarProfesorPorId(id);
        if (profesorEliminar != null) {
            // Crear una copia de la lista para evitar ConcurrentModificationException
            List<Curso> cursosDelProfesor = new ArrayList<>(profesorEliminar.getCursos());
            // Para cada curso que el profesor dictaba, establecer su profesor a null
            for (Curso curso : cursosDelProfesor) {
                if (curso != null) {
                    curso.setProfesor(null);
                }
            }
            // Remover el profesor de la lista de profesores
            profesores.remove(profesorEliminar);
            System.out.println("\n" + Emojis.CHECK_MARCADO + " Profesor " + profesorEliminar.getNombre() + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró el profesor con ID: " + id);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public Collection<Profesor> getProfesores() {
        return profesores;
    }

//    public Collection<Curso> getCursos() {
//        return Collections.unmodifiableList(cursos);
//    }

}
