
package tp3;

/**
 *
 * @author Hernán E. Bula
 * 
    5. Simulación de Nave Espacial
        Crear una clase NaveEspacial con los atributos: nombre, combustible.
        Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
        Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
        Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente                   Mostrar el estado al final.

     */

public class TP3_5 {

    public static void main(String[] args) {
        
        NaveEspacial falconHeavy = new NaveEspacial();
        
        falconHeavy.setNaveEspacial("Falcon Heavy", 0);
        
        falconHeavy.despegar();
        
        falconHeavy.recargarCombustible(253);
        
        falconHeavy.despegar();
        
        falconHeavy.avanzar(7);
        
        falconHeavy.recargarCombustible(80);
        
        falconHeavy.avanzar(7);
 
        falconHeavy.mostrarEstado();

   } // Fin de main

    
} // Fin de Class
