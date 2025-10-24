
package Agregacion1a1;

/**
 * @author Hernán E. Bula
 */

public class Auto {
    
    private String marca;
    private String modelo;
    private Motor motor; // Agregacion 1:1
    
    public Auto(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void mostrarMotor() {
        if (motor != null) {
            System.out.println("El auto " + marca + " " + modelo + " tiene un motor tipo: "  + motor.getTipo() + " " + motor.getCilindrada() + " " + motor.getCombustible());
        } else {
            System.out.println("El auto " + marca + " " + modelo + " no tiene motor.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
