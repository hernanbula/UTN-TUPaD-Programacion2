
package tp3;

public class TP3_1 {

    /*
    @author Hernán E. Bula
    
    1.​ Registro de Estudiantes
    a.​ Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
    Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),bajarCalificacion(puntos).
    Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
    calificaciones.
    
     */
    
    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante();
        
        est1.setEstudiante("Hernan", "Bula", 4, 7);
        
        est1.subirCalificacion(2);
        
        est1.bajarCalificacion(1);

        est1.getMostrarInfo();
        
    } // Fin de main

    
} // Fin de Class
