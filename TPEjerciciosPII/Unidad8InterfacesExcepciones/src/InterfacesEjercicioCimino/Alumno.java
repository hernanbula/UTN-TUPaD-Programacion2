
package InterfacesEjercicioCimino;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */

class Alumno implements Aprobable {

    private String DNI, apellido, nombre;
    private ArrayList<Examen> examenes;
    
    public Alumno(String DNI, String apellido, String nombre) { 
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }
    
    public void agregarExamen(Examen exam) { 
        this.examenes.add(exam);
    }

    @Override
    public boolean aprobo() {
        int i = 0;
        boolean aprobado = true;
        while (i < this.examenes.size() && this.examenes.get(i).aprobo()) {
            i++;
        }
        return (i == this.examenes.size());
    }
    
    
    
    
    
}
