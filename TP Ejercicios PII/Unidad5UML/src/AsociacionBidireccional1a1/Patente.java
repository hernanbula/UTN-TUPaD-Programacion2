package AsociacionBidireccional1a1;

/**
 *
 * @author Hernán E. Bula
 */
public class Patente {

    private String patente;
    private int anio;
    private Vehiculo vehiculo; // Asociacion 1:1. Referencia al vehiculo asociado

    public Patente(String numeroPatente, int anio) {
        this.patente = numeroPatente;
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String numeroPatente) {
        this.patente = numeroPatente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getPatente() != this) { // Evita el bucle infinito y asegura consistencia.
            vehiculo.setPatente(this);
        }
    }

}
