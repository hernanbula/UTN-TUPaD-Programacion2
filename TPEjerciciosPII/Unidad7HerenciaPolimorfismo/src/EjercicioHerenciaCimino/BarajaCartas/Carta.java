
package EjercicioHerenciaCimino.BarajaCartas;

import EjercicioHerenciaCimino.Baraja.Palo;

/**
 * @author Hernán E. Bula
 */

public abstract class Carta {

    private boolean tapada;
    private Palo palo;
    
    public Carta() { 
        // Por defecto, "tapada" es false.
        this.tapada = true;
    }
    
    public void daVuelta() {
        tapada = !tapada;
        // esto es lo mismo que:
//        if (tapada) {
//            tapada = false;
//        }else{
//            tapada = true;
//        }    
    }
    
    public void mostrar() { 
        if (tapada) {
            System.out.println("*******");   
        } else {
            System.out.println(getRepresentacion());
        } 
    }

    public boolean isTapada() {
        return tapada;
    }
    
    public abstract String getRepresentacion();

    @Override
    public String toString() {
        return "Carta{" + "tapada=" + tapada + ", palo=" + palo + '}';
    }
    
    
}
