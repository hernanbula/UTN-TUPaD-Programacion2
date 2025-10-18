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
    Además, existe la clase Universidad que administra el alta/baja y consulta de profesores y cursos.

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

 */


public class TP6_3_UniversidadProfesorCurso {

    public static void main(String[] args) {
        lineaMas(40);
        Universidad unc = new Universidad("Universidad Nacional de Córdoba");
        System.out.println("Universidad creada: \n " + Emojis.BIRRETE + " " + unc.getNombre());

//    1. Crear al menos 3 profesores y 5 cursos.
        lineaMas(40);
        System.out.println("Crear profesores y cursos:");

        // Creados 5 profesores
        System.out.println("\n - Creados 5 profesores " + Emojis.MANO_OK);
        Profesor profesor1 = new Profesor("P001", "Juan Pérez", "Programación");
        Profesor profesor2 = new Profesor("P002", "Ana Gómez", "Base de Datos");
        Profesor profesor3 = new Profesor("P003", "Carlos López", "Sistemas Operativos");
        Profesor profesor4 = new Profesor("P004", "María Rodríguez", "Ingeniería de Software");
        Profesor profesor5 = new Profesor("P005", "Luis Martínez", "Redes");

        // Creados 10 cursos 
        System.out.println("\n - Creados 10 cursos " + Emojis.LIBROS);
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Base de Datos");
        Curso curso4 = new Curso("C004", "Sistemas Operativos");
        Curso curso5 = new Curso("C005", "Ingeniería de Software");
        Curso curso6 = new Curso("C006", "Redes de Computadoras");
        Curso curso7 = new Curso("C007", "Desarrollo Web");
        Curso curso8 = new Curso("C008", "Desarrollo de Aplicaciones Móviles");
        Curso curso9 = new Curso("C009", "Estructuras de Datos");
        Curso curso10 = new Curso("C010", "Algoritmos");

//    2. Agregar profesores y cursos a la universidad.
        lineaMas(40);
        System.out.println("Agregados profesores " + Emojis.MANO_OK + " a la universidad " + Emojis.EDIFICIO_CLASICO);
        unc.agregarProfesor(profesor1);
        unc.agregarProfesor(profesor2);
        unc.agregarProfesor(profesor3);
        unc.agregarProfesor(profesor4);
        unc.agregarProfesor(profesor5);

        lineaMas(40);
        System.out.println("Agregados cursos " + Emojis.LIBROS + " a la universidad " + Emojis.EDIFICIO_CLASICO);
        unc.agregarCurso(curso1);
        unc.agregarCurso(curso2);
        unc.agregarCurso(curso3);
        unc.agregarCurso(curso4);
        unc.agregarCurso(curso5);
        unc.agregarCurso(curso6);
        unc.agregarCurso(curso7);
        unc.agregarCurso(curso8);
        unc.agregarCurso(curso9);
        unc.agregarCurso(curso10);

        
//    3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        lineaMas(40);
        System.out.println(Emojis.CHECK_MARCADO + " Asignar profesores a cursos  " + "\n");
       
        // Asignar 2 cursos por profesor
        unc.asignarProfesorACurso("C001", "P001"); // Programación I → Juan Pérez
        unc.asignarProfesorACurso("C002", "P001"); // Programación II → Juan Pérez

        unc.asignarProfesorACurso("C003", "P002"); // Base de Datos → Ana Gómez
        unc.asignarProfesorACurso("C007", "P002"); // Desarrollo Web → Ana Gómez

        unc.asignarProfesorACurso("C004", "P003"); // Sistemas Operativos → Carlos López
        unc.asignarProfesorACurso("C009", "P003"); // Estructuras de Datos → Carlos López

        unc.asignarProfesorACurso("C005", "P004"); // Ingeniería de Software → María Rodríguez
        unc.asignarProfesorACurso("C010", "P004"); // Algoritmos → María Rodríguez

        unc.asignarProfesorACurso("C006", "P005"); // Redes → Luis Martínez
        unc.asignarProfesorACurso("C008", "P005"); // Desarrollo Móvil → Luis Martínez

//    4. Listar cursos con su profesor y profesores con sus cursos.
        lineaMas(40);
        System.out.println(Emojis.LIBROS + " Listar cursos \n");
        unc.listarCursos();
        
        lineaMas(40);
        System.out.println(Emojis.MANO_OK + " Listar profesores \n");
        unc.listarProfesores();


//    5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        lineaMas(40);
        System.out.println("Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.\n ");
        unc.asignarProfesorACurso("C008", "P001");
        
        lineaMas(40);
        System.out.println(Emojis.LIBROS + " Listar cursos \n");
        unc.listarCursos();
        
        lineaMas(40);
        System.out.println(Emojis.MANO_OK + " Listar profesores \n");
        unc.listarProfesores();

        
//    6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        lineaMas(40);
        System.out.println("Remover un curso y confirmar que ya no aparece en la lista del profesor.\n");
        
        unc.eliminarCurso("C006");
        
        lineaMas(40);
        System.out.println(Emojis.MANO_OK + " Listar profesores \n");
        unc.listarProfesores();


//    7. Remover un profesor y dejar profesor = null,
        lineaMas(40);
        System.out.println("Remover un profesor y dejar profesor = null");
        unc.eliminarProfesor("P001"); // NO ESTÁ FUNCIONANDO
        
        lineaMas(40);
        System.out.println(Emojis.LIBROS + " Listar cursos \n");
        unc.listarCursos();


//    8. Mostrar un reporte: cantidad de cursos por profesor.
        lineaMas(40);
        System.out.println("Mostrar un reporte: cantidad de cursos por profesor.\n");
        for (Profesor profesor : unc.getProfesores()) {
            profesor.mostrarInfo();
        }
       
    }

    public static void lineaGuion(int n) {
        System.out.println("-".repeat(n));
    }

    public static void lineaMas(int n) {
        System.out.println("\n" + "+".repeat(n));
    }

    public static void linea_(int n) {
        System.out.println("_".repeat(n));
        System.out.println("_".repeat(n));
    }

}
