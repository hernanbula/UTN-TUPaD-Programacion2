
package EjercicioHerenciaCimino.BarajaCartas;

import EjercicioHerenciaCimino.Baraja.Palo;

/**
 * @author Hernán E. Bula
 */

public class CartaLiteral extends CartaConPalo {
    
    private final char letra;

    public CartaLiteral(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
    
        @Override
    public String getRepresentacion() {
        return "🂠 " + this.letra + super.getRepresentacion();
    }

}
