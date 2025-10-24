package EjercicioHerenciaCimino.Baraja;

import EjercicioHerenciaCimino.BarajaCartas.Carta;
import EjercicioHerenciaCimino.BarajaCartas.CartaJocker;
import EjercicioHerenciaCimino.BarajaCartas.CartaLiteral;
import EjercicioHerenciaCimino.BarajaCartas.CartaNumeral;
import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */
public class BarajaInglesa {

    ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
        System.out.println("Se generaron correctamente las " + cartas.size() + " cartas de la baraja.");
    }

    private void generarCartas() {
        generarCartasNumerales();
        generarCartasLiterales();
        generarCartasJockers();
    }

    private void generarCartasNumerales() {
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values();

        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];

            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
                this.cartas.add(new CartaNumeral(i, paloActual));
            }
        }
    }

    private void generarCartasLiterales() {
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();

        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];

            for (char letra: letras) {
                this.cartas.add(new CartaLiteral(letra, paloActual));
            }
        }
    }

    private void generarCartasJockers() {
        this.cartas.add(new CartaJocker(true));
        this.cartas.add(new CartaJocker(false));
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.daVuelta();
            carta.mostrar();
        }
    }

}
