
package TP5_14_EditorProyectoRender;

/**
 * @author Hernán E. Bula
 */

class Render {
    
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato) { 
        this.formato = formato;
    }
    
    public void setProyecto(Proyecto proyecto) { 
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "------------\nRENDER" + proyecto + "\n - Formato: " + formato;
    }
    
    

}
