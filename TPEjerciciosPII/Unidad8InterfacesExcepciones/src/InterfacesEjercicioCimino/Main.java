
package InterfacesEjercicioCimino;

/**
 * @author Hernán E. Bula
 */

public class Main {

    public static void main(String[] args) {
        
        CentroEducativo ipem192 = new CentroEducativo();

        Alumno pepe = new Alumno("12345678", "Fulano", "José");
        Alumno maria = new Alumno("23456789", "Mengana", "Maria");
        Alumno luis = new Alumno("34567890", "Vergara", "Luis");
        
        ipem192.agregarAlumno(pepe);
        ipem192.agregarAlumno(maria);
        ipem192.agregarAlumno(luis);
        
        pepe.agregarExamen(new ExamenEscrito(45, 7, "2025-02-24"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "2025-06-22"));
        pepe.agregarExamen(new ExamenEscrito(45, 7, "2025-06-22"));
        
        maria.agregarExamen(new ExamenEscrito(60, 4, "2025-04-17"));
        maria.agregarExamen(new ExamenEscrito(95, 8, "2025-02-24"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "2025-06-22"));
        
        luis.agregarExamen(new ExamenEscrito(100, 9, "2025-04-17"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE, "2025-02-24"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "2025-06-22"));
        
        System.out.println("Cantidad de alumnos: " + ipem192.cantidadAlumnos());
        System.out.println("Cantidad de aprobados: " + ipem192.cantidadAprobados());
        
        
    } 

}
