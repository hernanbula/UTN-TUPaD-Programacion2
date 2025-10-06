
package AsociacionUnidireccional1aN;

/**
 * @author Hernán E. Bula
 */

public class AsociacionUnidireccional1aN {

    public static void main(String[] args) {
        
        // Instanciamos un profesor
        Profesor bula = new Profesor("Hernán Bula");
        
        // Instanciamos varios cursos
        Curso prog1 = new Curso("Programacion 1", 20);
        Curso prog2 = new Curso("Programacion 2", 25);
        Curso ayso = new Curso("Arquitectura y Sistemas Operativos", 10);
        
        // Asociamos los cursos al profesor (Asociacion unidireccional 1 a N)
        bula.agregarCurso(prog1);
        bula.agregarCurso(ayso);
        bula.agregarCurso(prog2);
        
        bula.mostrarCursos();
        
        // Desvinculando curso del profesor (Asociacion unidireccional 1 a N)
        bula.desvincularCurso(ayso);
        
        System.out.println("\n++++++++++++++++++++++++++");
        System.out.println("Desvinculamos un curso");
        
        System.out.println("\n++++++++++++++++++++++++++");
        System.out.println("Imprimimos los cursos nuevamente ");
        bula.mostrarCursos();

        System.out.println("\n++++++++++++++++++++++++++");
        System.out.println("Imprimimos la info del curso desvinculado: " + ayso.getNombre());
        System.out.println("El curso no se elimina (sigue existiendo), solo se pierde la Asociación con el profesor");
        

    } 

}
