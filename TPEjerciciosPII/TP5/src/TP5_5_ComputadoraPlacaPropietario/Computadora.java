package TP5_5_ComputadoraPlacaPropietario;

/**
 * @author Hernán E. Bula
 */
class Computadora {

    private String marca, numeroSerie;
    private Propietario propietario; // Asociación bidireccional
    private PlacaMadre placaMadre; // Composición 1:1

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
            System.out.println("----------------\nSe ha asociado correctamente el propietario " + getPropietario().getNombre() + "a la computadora " + getMarca() + ", (n° serie " + getNumeroSerie()  + '.');
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    

    @Override
    public String toString() {
        if (propietario != null) {
            return "----------------\nComputadora: " + "\n -Marca: " + marca + "\n -Numero de Serie: " + numeroSerie + "\n" + placaMadre;
        } else {
            return "----------------\nLa computadora marca: " + marca + " (N° de serie " + numeroSerie + "), no tiene un propietario asociado. Por favor vincule uno para poder continuar.";
        }
    }
}
