
package ArrayList;

/**
 * @author Hernán E. Bula
 */

public class Auto {
    
    private String patente, color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + '}';
    }
    
    

}
