
package tp3;

/**
 *
 * @author Hernán E. Bula
 * 
    4. Gestión de Gallinas en Granja Digital
        a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
        Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
        Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */

public class TP3_4 {

    public static void main(String[] args) {
        
        Gallina gall1 = new Gallina();
        Gallina gall2 = new Gallina();
        
        gall1.setGallina(001, 0, 0);
        gall2.setGallina(002, 0, 0);
        
        gall1.envejecer(1);
        gall2.envejecer(1);
        
        gall1.ponerHuevo(400);
        gall2.ponerHuevo(1200);
        
        gall1.mostrarEstado();
        gall2.mostrarEstado();
        
    
    } // Fin de main

    
} // Fin de Class

