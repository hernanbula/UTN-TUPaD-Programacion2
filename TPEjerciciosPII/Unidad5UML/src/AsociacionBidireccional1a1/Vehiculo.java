package AsociacionBidireccional1a1;

/**
 *
 * @author Hernán E. Bula
 */
public class Vehiculo {

    private String tipo;
    private String modelo;
    private Patente patente; // Asociacion 1:1. Referencia a la patente asociada

    public Vehiculo(String tipo, String modelo) {
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
        if (patente != null && patente.getVehiculo() != this) { // Evita el bucle infinito y asegura consistencia.
            patente.setVehiculo(this);
        }
    }

}
