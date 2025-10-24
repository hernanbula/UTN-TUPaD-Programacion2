package TP5_1_PasaporteFotoTitular;

/**
 * @author Hernán E. Bula
 */
public class Pasaporte {

    private String numero;
    private String fechaEmision; // aaaammdd
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    @Override
    public String toString() {
        return titular + "\n--------------\n" + "Pasaporte: \n -Numero: " + numero + "\n -Fecha de emision: " + fechaEmision + "\n" + foto;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) { // Evita el bucle infinito y asegura consistencia.
            titular.setPasaporte(this);
        }
    }
 
    
}
