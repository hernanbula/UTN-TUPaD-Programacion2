
package tp3;

   /*
    @author Hernán E. Bula
    
    1.​ Registro de Estudiantes
    a.​ Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
    Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),bajarCalificacion(puntos).
    Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
    calificaciones.
    
     */

public class Estudiante {

    private String nombre,apellido;
    private int curso, calificacion;

    
    public void setEstudiante(String nombreNuevo, String apellidoNuevo, int cursoNuevo, int calificacionNueva) {
        nombre = nombreNuevo;
        apellido = apellidoNuevo;
        curso = cursoNuevo;
        calificacion = calificacionNueva;
        getMostrarInfo();
    }
            
    public void getMostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println();
    }
 
    public int setSubirCalificacion(int puntos) {
        calificacion += puntos;
        getMostrarInfo();
        return calificacion;
    }
    
    public int setBajarCalificacion(int puntos) {
        calificacion -= puntos;
        getMostrarInfo();
        return calificacion;
   
    }
    
} // Fin de Class
