
package TP4_0b;

/**
 * @author Hernán E. Bula

* Caso Práctico
    Sistema de Gestión de Empleados
    Modelar una clase Empleado que represente a un trabajador en una empresa.
    Esta clase debe incluir constructores sobrecargados, métodos sobrecargados 
    y el uso de atributos y métodos estáticos para llevar control de los objetos creados.

* CLASE EMPLEADO
    Atributos:
    - int id: Identificador único del empleado.
    - String nombre: Nombre completo.
    - String puesto: Cargo que desempeña.
    - double salario: Salario actual.
    - static int totalEmpleados: Contador global de empleados creados.​

* REQUERIMIENTOS
    1.​ Uso de this:
        ○​ Utilizar this en los constructores para distinguir parámetros de atributos.
    2.​ Constructores sobrecargados:
        ○​ Uno que reciba todos los atributos como parámetros.
        ○​ Otro que reciba solo nombre y puesto, asignando un id automático y un salario por defecto.
        ○​ Ambos deben incrementar totalEmpleados.
    3.​ Métodos sobrecargados actualizarSalario:
        ○​ Uno que reciba un porcentaje de aumento.
        ○​ Otro que reciba una cantidad fija a aumentar.
    4.​ Método toString():
        ○​ Mostrar id, nombre, puesto y salario de forma legible.
    5.​ Método estático mostrarTotalEmpleados():
        ○​ Retornar el total de empleados creados hasta el momento.

* TAREAS A REALIZAR
    1.​ Implementar la clase Empleado aplicando todos los puntos anteriores.
    2.​ Crear una clase de prueba con método main que:
        ○​ Instancie varios objetos usando ambos constructores.
        ○​ Aplique los métodos actualizarSalario() sobre distintos empleados.
        ○​ Imprima la información de cada empleado con toString().
        ○​ Muestre el total de empleados creados con mostrarTotalEmpleados().​

* CONSEJOS
    ●​ Usá this en los constructores para evitar errores de asignación.
    ●​ Probá distintos escenarios para validar el comportamiento de los métodos sobrecargados.
    ●​ Asegúrate de que el método toString() sea claro y útil para depuración.
    ●​ Confirmá que el contador totalEmpleados se actualiza correctamente en cada constructor.
 */

public class EjercicioTP4 {

    public static void main(String[] args) {
        
//        * TAREAS A REALIZAR
    //    1.​ Implementar la clase Empleado aplicando todos los puntos anteriores.
    //    2.​ Crear una clase de prueba con método main que:
//        ○​ Instancie varios objetos usando ambos constructores.
//        ○​ Aplique los métodos actualizarSalario() sobre distintos empleados.
//        ○​ Imprima la información de cada empleado con toString().
//        ○​ Muestre el total de empleados creados con mostrarTotalEmpleados().​
        
        Empleado empleado1 = new Empleado("Hernán Bula", "Developer");
        Empleado empleado2 = new Empleado(123, "Enrique Papparelli", "Project Manager", 2000000);
        Empleado empleado3 = new Empleado("Liliana Verbian", "Tester");
        Empleado empleado4 = new Empleado(123, "Manuel Vizcaino", "Scrum Master", 2500000);
        Empleado empleado5 = new Empleado("Fernando Saraza", "Developer");
        
        System.out.println(empleado1);
        empleado1.actualizarSalario(500000);
        
        System.out.println(empleado2);
        empleado2.actualizarSalario(30.0);
        
        System.out.println(empleado3);
        empleado3.actualizarSalario(350000);
        
        System.out.println(empleado4);
        empleado4.actualizarSalario(1100000);
        
        System.out.println(empleado5);
        empleado5.actualizarSalario(8.0);
        
        
        System.out.println("\n" + "-".repeat(65) + "\n" + "🏭 El total de empleados de la empresa es: " + Empleado.mostrarTotalEmpleados() + "\n");
        
        
        

    } 

}