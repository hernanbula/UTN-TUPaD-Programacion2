
package TP5_9_CitaPacienteProfesional;

/**
 * @author Hernán E. Bula
 */

class CitaMedica {

    private String fecha, hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public void mostrarCitaMedica() {
        System.out.println("\nLos datos de su cita médica son:" + "\n------------\n -Fecha: " + fecha + "\n -Hora: " + hora + profesional + paciente);
    }
    
}
