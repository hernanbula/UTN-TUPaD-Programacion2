
package Agregacion1aN;

/**
 * @author Hernán E. Bula
 */

public class Agregacion1aN {

    public static void main(String[] args) {
        
        // Instanciamos la Empresa
        Empresa claro = new Empresa ("Claro");
        
        // Instanciamos empleados
        Empleado carlos = new Empleado("Carlos Casares", "Técnico Instalador");
        Empleado maria = new Empleado("Maria Perez", "Agente de ventas");
        Empleado juana = new Empleado("Juana Viale", "Gerente de desarrollo");
        Empleado fernanda = new Empleado("Fernanda Vergara", "CEO");
        Empleado jose = new Empleado("Jose María Fernandez", "Tester");
        Empleado hernan = new Empleado("Hernán Bula", "Programador");
        
        // Agregamos los empleados a la Empresa
        claro.agregarEmpleado(carlos);
        claro.agregarEmpleado(maria);
        claro.agregarEmpleado(juana);
        
        // Mostramos los empleados a la Empresa
        claro.mostrarEmpleados();
        
        // Agregamos y removemos empleados
        claro.agregarEmpleado(hernan);
        claro.agregarEmpleado(fernanda);
        claro.mostrarEmpleados();
        
        claro.removerEmpleado(carlos);
        claro.mostrarEmpleados();
        
        claro.removerEmpleado(jose);
        claro.mostrarEmpleados();
        
    } 

}
