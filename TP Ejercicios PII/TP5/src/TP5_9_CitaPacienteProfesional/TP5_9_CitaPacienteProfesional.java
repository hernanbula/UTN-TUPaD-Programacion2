
package TP5_9_CitaPacienteProfesional;

/**
 * @author Hernán E. Bula
 * 
 * 9.​ CitaMédica - Paciente - Profesional
    a.​ Asociación unidireccional: CitaMédica → Paciente,
    b.​ Asociación unidirecciona: CitaMédica → Profesional
    Clases y atributos:
        i.CitaMédica: fecha, hora
        ii.​Paciente: nombre, obraSocial
        iii.​Profesional: nombre, especialidad
 */

public class TP5_9_CitaPacienteProfesional {

    public static void main(String[] args) {
        
        Paciente pac1 = new Paciente("Hernán Bula", "APROSS");
        Profesional prof1 = new Profesional("Dr. Juan Perez", "Dermatólogía");
        CitaMedica cita1 = new CitaMedica ("2025-09-20", "18:00 hs");
        
        cita1.setPaciente(pac1); // Asociación unidireccional
        cita1.setProfesional(prof1); // Asociación unidireccional
        
        cita1.mostrarCitaMedica();

    } 

}
