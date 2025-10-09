
package TP6_3;

/**
 * @author Hernán E. Bula
 * 
Ejercicio 3- Universidad, Profesor y Curso (bidireccional 1 a N)

1. Descripción general
    Se debe modelar un sistema académico donde un Profesor dicta muchos Cursos y
    cada Curso tiene exactamente un Profesor responsable. La relación Profesor–
    Curso es bidireccional:
    • Desde Curso se accede a su Profesor.
    • Desde Profesor se accede a la lista de Cursos que dicta.
    Además, existe la clase Universidad que administra el alta/baja y consulta
    de profesores y cursos.

    Invariante de asociación: cada vez que se asigne o cambie el profesor de un curso,
    debe actualizarse en los dos lados (agregar/quitar en la lista del profesor
    correspondiente).

2. Clases a implementar
    Clase Profesor
        Atributos:
            • id (String) → Identificador único.
            • nombre (String) → Nombre completo.
            • especialidad (String) → Área principal.
            • List<Curso> cursos → Cursos que dicta.
        Métodos sugeridos:
            • agregarCurso(Curso c) → Agrega el curso a su lista si no está y sincroniza
            el lado del curso.
            • eliminarCurso(Curso c) → Quita el curso y sincroniza el lado del curso
            (dejar profesor en null si corresponde).
            • listarCursos() → Muestra códigos y nombres.
            • mostrarInfo() → Imprime datos del profesor y cantidad de cursos.
            
    Clase Curso
        Atributos:
            • codigo (String) → Código único.
            • nombre (String) → Nombre del curso.
            • profesor (Profesor) → Profesor responsable.
        Métodos sugeridos:
            • setProfesor(Profesor p) → Asigna/cambia el profesor sincronizando ambos lados:
            o Si tenía profesor previo, quitarse de su lista.
            • mostrarInfo() → Muestra código, nombre y nombre del profesor (si tiene).
            
    Clase Universidad
        Atributos:
            • String nombre
            • List<Profesor> profesores
            • List<Curso> cursos
        Métodos requeridos:
            • agregarProfesor(Profesor p)
            • agregarCurso(Curso c)
            • asignarProfesorACurso(String codigoCurso, String idProfesor) → Usa setProfesor del curso.
            • listarProfesores() / listarCursos()
            • buscarProfesorPorId(String id)
            • buscarCursoPorCodigo(String codigo)
            • eliminarCurso(String codigo) → Debe romper la relación con su profesor si la hubiera.
            • eliminarProfesor(String id) → Antes de remover, dejar null los cursos que dictaba.

Tareas a realizar
    1. Crear al menos 3 profesores y 5 cursos.
    2. Agregar profesores y cursos a la universidad.
    3. Asignar profesores a cursos usando asignarProfesorACurso(...).
    4. Listar cursos con su profesor y profesores con sus cursos.
    5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
    6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
    7. Remover un profesor y dejar profesor = null,
    8. Mostrar un reporte: cantidad de cursos por profesor.

Conclusiones esperadas
    • Diferenciar bidireccionalidad de una relación unidireccional (navegación desde ambos extremos).
    • Mantener invariantes de asociación (coherencia de referencias) al agregar, quitar o reasignar.
    • Practicar colecciones (ArrayList), búsquedas y operaciones de alta/baja.
    • Diseñar métodos “seguros” que sincronicen los dos lados siempre.
 * 
 */

public class TP6_3_UniversidadProfesorCurso {

    public static void main(String[] args) {
        // TODO code application logic here

    } 

}
