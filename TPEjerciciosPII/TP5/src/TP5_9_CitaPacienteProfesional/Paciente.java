
package TP5_9_CitaPacienteProfesional;

/**
 * @author Hernán E. Bula
 */

class Paciente {

    private String nombre, obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "\n------------\nPaciente:" + "\n -Nombre: " + nombre + "\n  -Obra Social: " + obraSocial;
    }
    
    
    
    
    
}
