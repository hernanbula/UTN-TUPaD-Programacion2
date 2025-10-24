
package TP5_14_EditorProyectoRender;

/**
 * @author Hernán E. Bula
 */

class Proyecto {
    
    private String nombre;
    private int duracionMin;
    
    public Proyecto(String nombre, int duracionMin) { 
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre() { 
        return nombre;
    }
    
    public int getDuracion() { 
        return duracionMin;
    }

    @Override
    public String toString() {
        return " Proyecto:\n - Nombre: " + nombre + "\n - Duración (minutos): " + duracionMin;
    }

}
