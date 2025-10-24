
package TP3_4;

/**
 *
 * @author Hernán E. Bula
 * 
    4. Gestión de Gallinas en Granja Digital
        a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
        Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
        Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */

public class Gallina {

    private int idGallina, edad, huevosPuestos = 0;
    
    public void setGallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    // Este método agrega años a la gallina en función de los huevos puestos. 
    // Suponiendo que una gallina pone un huevo por día, cada 365 huevos/días suma un año de vida.
    public int ponerHuevo(int cantidad) {
        huevosPuestos += cantidad;
        if (huevosPuestos>=365) {
            envejecer(huevosPuestos/365);
        }
        return huevosPuestos;
    }
    
    public int envejecer(int anios) {
        edad += anios;
        return edad;
    } 
    
    public int getIdGallina() {
        System.out.println("Id Gallina: " + idGallina);
        return idGallina;
    }
    
    public int getEdad() {
        System.out.println("Edad: " + edad);
        return edad;
    }
    
    public int getHuevosPuestos() {
        System.out.println("Huevos puestos: " + huevosPuestos);
        return huevosPuestos;
    }
    
    public void mostrarEstado() {
        System.out.println("----------------");
        getIdGallina();
        getEdad();
        getHuevosPuestos();
        System.out.println();
    }
    
    
}
