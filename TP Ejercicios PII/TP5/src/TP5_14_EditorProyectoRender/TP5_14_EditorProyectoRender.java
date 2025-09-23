
package TP5_14_EditorProyectoRender;

/**
 * @author Hernán E. Bula
 * 
 * 14.​EditorVideo - Proyecto - Render
    a.​ Asociación unidireccional: Render → Proyecto
    b. ​Dependencia de creación: EditorVideo.exportar(String, Proyecto)
    c.​ Clases y atributos:
        i.​Render: formato.
        ii.Proyecto: nombre, duracionMin.
        iii.EditorVideo->método: void exportar(String formato, Proyecto proyecto)
 */

public class TP5_14_EditorProyectoRender {

    public static void main(String[] args) {
        
        Proyecto proy1 = new Proyecto("Edicion_v.1.3.", 45);
        EditorVideo editor1 = new EditorVideo();
        editor1.exportar(".mp4", proy1);

    } 

}
