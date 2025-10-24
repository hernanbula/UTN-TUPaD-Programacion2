
package InterfacesEjercicioCimino;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */

public class CentroEducativo {

    private ArrayList<Alumno> alumnos;
    private int contadorAlumnos = 0; 

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        contadorAlumnos ++; 
    }
    
    public int cantidadAlumnos() {
        return this.contadorAlumnos;
    }
        
    public int cantidadAprobados() {
        int contadorAprobados = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.aprobo()) {
                contadorAprobados ++;
            }
        }
        return contadorAprobados;
    }
    
}
