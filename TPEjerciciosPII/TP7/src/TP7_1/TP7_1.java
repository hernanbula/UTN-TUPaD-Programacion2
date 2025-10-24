
package TP7_1;

/**
 * @author Hernán E. Bula
 * 
 * 1. Vehículos y herencia básica
        ● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
        ● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe
        mostrarInfo()
        ● Tarea: Instanciar un auto y mostrar su información completa. 
* 
 */

public class TP7_1 {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("VW", "Nivus", 5);
        auto1.mostrarInfo();
    } 

}
