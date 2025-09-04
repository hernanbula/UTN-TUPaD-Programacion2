
package metodoscomprotamientosobjeto;

public class CuentaBancaria {
    
    // ATRIBUTOS
    private String CBU;
    private String alias, moneda, tipo;
    private double saldo;
    
    // CONSTRUCTORES
    
    // Constructor 1
    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generateCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }
    
    // Constructor 2
    public CuentaBancaria (String moneda, String tipo) {
      // setAlias("ALIAS.POR.DEFECTO");
      // setMoneda(moneda);
      // setTipo(tipo);
        this("ALIAS.POR.DEFECTO", moneda, tipo); // Esto funciona igual que lo anterior, pero nos evta repetir código. Llamamos al constructor con más parámetros y configuramos el parámetro que nos falta.
    }  
    
    //Constructor 3
    public CuentaBancaria() {  
    }
    
    // METODOS
    
    private String generateCBU() {
        return "1234567890";
    }
    
    public void mostrarDatos() {
        System.out.println("CBU: " + CBU + "; alias: " + alias + "; moneda: " + moneda + "; tipo: " + tipo + "; saldo: " + saldo);
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU: " + CBU + "; alias: " + alias + "; moneda: " + moneda + "; tipo: " + tipo + "; saldo: " + saldo + '}';
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }
    
    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }
    
    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
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


