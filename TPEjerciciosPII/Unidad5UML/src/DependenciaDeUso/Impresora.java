
package DependenciaDeUso;


/**
 *
 * @author Hernán E. Bula
 */

public class Impresora {
    
    private boolean estaEncendida;
    
public void encender() {
    estaEncendida = true;
}

public void imprimir(Documento doc) {
    if (estaEncendida) {
        System.out.println("Imprimiendo documento\n" + doc.getTitulo());
        System.out.println("*********************");
        System.out.println(doc.getCuerpo());
        System.out.println("*****************************\n");
    } else {
        System.out.println("¡Impresora apagada!\n");
    }
}

}
