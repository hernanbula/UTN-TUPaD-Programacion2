
package EjercicioHerenciaCimino.BarajaCartas;

/**
 * @author Hernán E. Bula
 */

public class CartaJocker extends Carta {
    
    private boolean aColor;
    
    public CartaJocker(boolean aColor) { 
        super(); // Puede no usarse ci¿uando la superclase no tiene argumentos en su contsructor
        this.aColor = aColor;
    }
        
    @Override
    public String getRepresentacion() {
        return "🃏 Jocker " + (aColor ? "a colores." : "blanco y negro.");
    }
    

}
