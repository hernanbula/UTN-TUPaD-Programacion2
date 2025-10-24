package AsociacionBidireccional1aN;

/**
 * @author Hernán E. Bula
 */
public class AsociacionBidireccional1aN {

    public static void main(String[] args) {

        // Instanciamos 3 departamentos
        Departamento ventas = new Departamento("Ventas");
        Departamento rrhh = new Departamento("RR.HH.");
        Departamento it = new Departamento("IT");

        // Instanciamos empleados
        Empleado mario = new Empleado("Mario Baracus", "Vendedor");
        Empleado maria = new Empleado("Maria Fara", "Reclutadora");
        Empleado fernando = new Empleado("Fernando Traverso", "Desarrollador");
        Empleado carlos = new Empleado("Carlos Cáceres", "Gerente de ventas");
        Empleado hernan = new Empleado("Hernán Bula", "Project Manager");

        // Asociamos los empleados a los Departamentos
        ventas.agregarEmpleado(mario);
        ventas.agregarEmpleado(carlos);
        rrhh.agregarEmpleado(maria);
        it.agregarEmpleado(fernando);
        it.agregarEmpleado(hernan);

        // Mostramos los departamentos
        mostrarDepartamento(ventas);
        mostrarDepartamento(rrhh);
        mostrarDepartamento(it);
        
        // Traspasamos un empleado de Ventas a RR.HH
        carlos.setDepartamento(rrhh);
        
        // Mostramos de nuevo los departamentos
        System.out.println("\n" + "+".repeat(23) + "\n");
        mostrarDepartamento(ventas);
        mostrarDepartamento(rrhh);
        mostrarDepartamento(it);
    
    }

    public static void mostrarDepartamento(Departamento departamento) {
        String lineaMas = "\n" + "+".repeat(23) + "\n"; // Linea de signos mas (+++++++++++++++++++++++)
        String lineaGuion = "-".repeat(49) + "\n"; // Linea de lineaGuion (-------------------------------------------------)

        System.out.println(lineaMas + "        Empleados del Depto " + departamento.getTipo() + lineaMas);
        for (Empleado empleado : departamento.getEmpleados()) {
            System.out.println(" - Empleado: " + empleado.getNombre());
            System.out.println(" - Puesto: " + empleado.getPuesto());
            // Validamos que el empleado también asoció el departamento
            System.out.println(" - Departamento: " + empleado.getDepartamento().getTipo());
            System.out.println(lineaGuion);
        }
    }

}
