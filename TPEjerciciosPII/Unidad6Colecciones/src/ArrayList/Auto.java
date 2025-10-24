
package ArrayList;

/**
 * @author Hernán E. Bula
 */

public class Auto {
    
    private String patente, color;
    private double km;

    public Auto(String patente, String color, double km) {
        this.patente = patente;
        this.color = color;
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
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
        return "Auto{" + "patente=" + patente + ", color=" + color + ", km=" + km + '}';
    }

    
    
    

}
