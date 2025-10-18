
package EjercicioHerenciaCimino.BarajaCartas;

import EjercicioHerenciaCimino.Baraja.Palo;

/**
 * @author Hernán E. Bula
 */

public class CartaNumeral extends CartaConPalo {
    
    private final int numero;

    public CartaNumeral(int numero, Palo paloActual) {
        super(paloActual);
        this.numero = numero;
    }
    
    @Override
    public String getRepresentacion() {
        return "🂠 " + this.numero + getPalo();
    }
    


}


