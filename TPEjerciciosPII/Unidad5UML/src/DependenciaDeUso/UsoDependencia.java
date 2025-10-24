
package DependenciaDeUso;


/**
 *
 * @author Hernán E. Bula
 */

public class UsoDependencia {

    public static void main(String[] args) {
        
        Documento doc = new Documento("\nTÍTULO DOCUMENTO", "Esto es el cuerpo\nde un documento de prueba.");
        Impresora imp1 = new Impresora();
        
        imp1.imprimir(doc);
        
        imp1.encender();
        imp1.imprimir(doc);
        



    }

}
