package TP5_2_CelularBateriaUsuario;

/**
 * @author Hernán E. Bula
 */
public class Celular {

    private String imei, marca, modelo;
    private Bateria bateria; // Agregacion 1:1
    private Usuario usuario; // Asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void mostrarBateria() {
        if (bateria != null) {
            System.out.println("\nEl celular " + marca + " " + modelo + ",con IMEI " + imei + ",tiene una bateria " + bateria.getModelo() + ",con una capacidad de " + bateria.getCapacidad());
        } else {
            System.out.println("\nEl celular " + marca + ",\n modelo " + modelo + ", \n con IMEI " + imei + ",\n no tiene una bateria");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) { // Evita el bucle infinito y asegura consistencia.
            usuario.setCelular(this);
        }
    }
    
    public void mostrarCelular() {
        System.out.println("\nEl celular " + marca + " " + modelo + " con IMEI: " + imei + ", pertenece la siguiente persona:\n" + usuario);
    }
    
    @Override
    public String toString() {
        return "--------------\nCelular: \n -Marca: " + marca + "\n -Modelo: " + modelo + "\n -IMEI: " + imei; 
    }
    
}
