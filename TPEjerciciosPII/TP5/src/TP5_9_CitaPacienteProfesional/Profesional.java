
package TP5_9_CitaPacienteProfesional;

/**
 * @author Hernán E. Bula
 */

class Profesional {
    
    private String nombre, especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "\n------------\nProfesional: " + "\n -Nombre: " + nombre + "\n  -Especialidad: " + especialidad;
    }

    
}
