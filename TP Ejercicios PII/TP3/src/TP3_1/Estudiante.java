package TP3_1;

/*
    @author Hernán E. Bula
    
    1.​ Registro de Estudiantes
    a.​ Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
    Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),bajarCalificacion(puntos).
    Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
    calificaciones.
    
 */
public class Estudiante {

    private String nombre, apellido;
    private int curso, calificacion;

    public void setEstudiante(String nombre, String apellido, int curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
        getMostrarInfo();
    }

    public String getNombre() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        return nombre + " " + apellido;
    }

    public int getCurso() {
        System.out.println("Curso: " + curso);
        return curso;
    }

    public int getCalificacion() {
        System.out.println("Calificacion: " + calificacion + "\n");
        return calificacion;
    }
    
    public void getMostrarInfo() {
        System.out.println("INFORMACIÓN DEL ESTUDIANTE");
        getNombre();
        getCurso();
        getCalificacion();
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
        System.out.print("Subir nota. ");
        setCalificacion(calificacion);
        getCalificacion();
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        System.out.print("Bajar nota. ");
        setCalificacion(calificacion);
        getCalificacion();
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0) {
            this.calificacion = 0; // Evitar valores negativos
            System.out.println("La calificación no puede ser negativa.");
        } else if (calificacion > 10) {
            this.calificacion = 10; // Evitar valores mayores a 10
            System.out.println("La calificación no puede ser mayor a 10.");
        } else {
            this.calificacion = calificacion;
        }
    }

} // Fin de Class
