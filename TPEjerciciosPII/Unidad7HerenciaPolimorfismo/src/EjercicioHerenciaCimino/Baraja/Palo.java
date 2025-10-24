
package EjercicioHerenciaCimino.Baraja;

/**
 * @author Hernán E. Bula
 */

public enum Palo {
    
    CORAZONES(Color.NEGRO, '♡'),
    PICA(Color.NEGRO,'♠'), 
    DIAMANTE(Color.ROJO, '♢'),
    TREBOL(Color.ROJO, '♣');

    private Color color;
    private char simbolo;
    
    private Palo(Color color, char simbolo) {
        this.color = color;
        this.simbolo = simbolo;
    }

    public Color getColor() {
        return color;
    }

    public char getSimbolo() {
        return simbolo;
    }
    
}
