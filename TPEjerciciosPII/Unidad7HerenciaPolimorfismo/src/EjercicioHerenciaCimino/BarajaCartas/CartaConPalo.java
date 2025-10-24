package EjercicioHerenciaCimino.BarajaCartas;

import EjercicioHerenciaCimino.Baraja.Palo;

/**
 * @author Hernán E. Bula
 */
public abstract class CartaConPalo extends Carta {

    public Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public char getPalo() {
        return palo.getSimbolo();
    }

    @Override
    public String getRepresentacion() {
        return "" + getPalo();
    }

}
