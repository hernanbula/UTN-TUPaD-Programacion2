
package TP5_14_EditorProyectoRender;

/**
 * @author Hernán E. Bula
 */

class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("El proyecto " + proyecto.getNombre() + " se guardó correctamente. Se procede a exportar el archivo.");
        System.out.println(render);
    }

}
