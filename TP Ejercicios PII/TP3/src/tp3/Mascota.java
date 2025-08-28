
package tp3;

    /*
    @author Hernán E. Bula
    
    2. Registro de Mascotas
        a. Crear una clase Mascota con los atributos: nombre, especie, edad.
        Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
     */

public class Mascota {

    private String nombre, especie;
    private int edad;
    
    public void setMascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("");
    }
    
    public int cumplirAnios() {
        edad ++;
        mostrarInfo();
        return edad;
    }
}
