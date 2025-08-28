
package tp3;

public class TP3_2 {

    /*
    @author Hernán E. Bula
    
    2. Registro de Mascotas
        a. Crear una clase Mascota con los atributos: nombre, especie, edad.
        Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
     */
    
    public static void main(String[] args) {
        
        Mascota masc1 = new Mascota();
        
        masc1.setMascota("Cancan", "gato", 3);
        
        masc1.mostrarInfo();
        
        masc1.cumplirAnios();
        
    } // Fin de main

    
} // Fin de Class
