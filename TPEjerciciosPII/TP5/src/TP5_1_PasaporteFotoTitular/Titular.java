package TP5_1_PasaporteFotoTitular;

/**
 * @author Hernán E. Bula
 */
public class Titular {

    private String nombreApellido;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombreApellido, String dni) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) { // Evita el bucle infinito y asegura consistencia.
            pasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "--------------\n" + "Titular:\n -Nombre y Apellido: " + nombreApellido + "\n -DNI: " + dni;
    }

}
