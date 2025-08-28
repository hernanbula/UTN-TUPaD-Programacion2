
package metodoscomprotamientosobjeto;

public class CuentaBancaria {
    
    private String CBU;
    private String alias;
    private double saldo;
    
    public void mostrarDatos() {
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    
    public void setAlias(String nuevoAlias) {
        if (nuevoAlias != null) {
            alias = nuevoAlias;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public void depositar(double monto) {
        if (monto > 0) {
        saldo += monto;
        } else {
        System.out.println("Debe ingresar un número positivo para depositar.");
        }
    }
    
    public boolean saldoDisponible(double monto) {
        return saldo >= monto;
        }
    
    public void extraccion(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
            System.out.println("Retire su dinero ($" + monto + "). \nEl saldo en su cuenta es: $" + getSaldo());
        } else {
            System.out.println("El saldo es insuficiente para esta extracción.");
        }
        
    }
    
    }


