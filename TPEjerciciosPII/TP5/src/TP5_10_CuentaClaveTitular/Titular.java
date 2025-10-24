
package TP5_10_CuentaClaveTitular;

/**
 * @author Hernán E. Bula
 */

class Titular {
    
    private String nombre, dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) { //  Asociación bidireccional
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
            System.out.println("\n------------\nSe asoció correctamente esta Cuenta bancaria a su titular.");
        }
    }
    
    public CuentaBancaria getCuentaBancaria() { 
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        return "\n -Nombre: " + nombre + "\n -DNI: " + dni;
    }
    
    
    
    

}
