
package TP5_10_CuentaClaveTitular;

/**
 * @author Hernán E. Bula
 */

class CuentaBancaria {
    
    private String cbu;
    private int saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, int saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
            System.out.println("\n------------\nSe asoció correctamente el titular a esta Cuenta bancaria.");
        }
    }
    
    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "\n------------\nCuenta Bancaria: " + "\n -CBU: " + cbu + "\n -Saldo: " + saldo + claveSeguridad + "\n--------------\nTitular: " + titular;
    }
    
    

}
