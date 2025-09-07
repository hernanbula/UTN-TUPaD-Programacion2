package tp4;

/**
 *
 * @author Hernán E. Bula
 * 
 * Caso Práctico 4 - Banca Simple – Cuentas

* CLASE CUENTA
    Atributos:​
    int numero: Número de cuenta autogenerado.
    String titular: Titular de la cuenta.
    double saldo: Saldo disponible.
    static int ultimoNumero: Base para autoincrementar la numeración.(por defecto 100)
    static int totalCuentas: Contador global de cuentas creadas. (por defecto 0)

* REQUERIMIENTOS
    1.​ Uso de this:
        ○ Utilizar this en los constructores para distinguir parámetros de atributos.
    2.​ Encapsulamiento:
        ○ Todos los atributos de la clase deben ser private. 
          Proporcionar los métodos get y set públicos (public) necesarios para acceder o modificar 
          los atributos, excepto aquellos que no deberían ser alterados desde fuera de la clase.
    3.​ Constructores sobrecargados:
        ○​ Uno que reciba titular (saldo inicial 0).
        ○​ Otro que reciba titular y saldoInicial.
        ○​ Ambos asignan this.numero = ++ultimoNumero e incrementan totalCuentas.​
    4.​ Métodos sobrecargados consultarSaldo:
        ○​ Uno que retorne el saldo actual en pesos (double).
        ○​ Otro que reciba una cotización de dólar (double cotizacionDolar) y devuelva el saldo convertido a dólares.
        ○​ Ejemplo:
            •​ Si el saldo es $2000 y la cotización del dólar es 1360 → consultarSaldo(1360) devuelve 1.47​
    5.​ Metodos depositar() y extraer(): aplicar validaciones para montos negativos o por fuera del límite disponible
    6.​ Método estático mostrarTotalCuentas(): Retornar la cantidad total de cuentas creadas.
    7.​ Método toString(): mostrar número, titular, saldo con dos decimales.

* TAREAS A REALIZAR
    1.​ Crear cuentas con ambos constructores.
    2.​ Probar las dos variantes de consultarSaldo.
    3.​ Mostrar las cuentas con toString().
    4.​ Mostrar el total de cuentas generadas.
* 
 */

public class Cuenta {

    // ATRIBUTOS
    
    private int numero; // Número de cuenta autogenerado.
    private String titular; // Titular de la cuenta.
    private double saldo; // Saldo disponible.
    private static int ultimoNumero = 100; // Base para autoincrementar la numeración.(por defecto 100)
    private static int totalCuentas =  0; // Contador global de cuentas creadas. (por defecto 0)

    // CONSTRUCTORES

//      Uno que reciba titular (saldo inicial 0).
        public Cuenta(String titular) {
            this(titular, 0);
           
        }  
    
//      Otro que reciba titular y saldoInicial.
        public Cuenta(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial; 
            this.numero = Cuenta.ultimoNumero++;
            Cuenta.totalCuentas++;
        }
    
    
    // GETTERS Y SETTERS
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // METODOS
    
//  Uno que retorne el saldo actual en pesos (double).
    public double consultarSaldo() {
        System.out.println("\nEl saldo en pesos de la cuenta N° " + numero + " es $" + saldo);
        return saldo;
    }
    
//  Otro que reciba una cotización de dólar (double cotizacionDolar) y devuelva el saldo convertido a dólares.
    public double consultarSaldo(double cotizacionDolar) {
        System.out.println("\nEl saldo en dolares de la cuenta N° " + numero + " es U$S" + Cuenta.truncarDecimales(saldo / cotizacionDolar));
        return (saldo / cotizacionDolar);
    }
    
    public void depositar(double monto) {
        if (monto > 0) { // validación numero positivo
            this.saldo += monto;
        } else {
            System.out.println("\nPara depositar debe ingresar un monto positivo.");
        }
    }
    
    public void extraer(double monto) {
        if (monto <= this.saldo) { // validación de saldo
            this.saldo -= monto;
        } else {
            System.out.println("\nNo hay saldo suficiente para la extracción.");
        }
    }

    public static int mostrarTotalCuentas() { // Retorna la cantidad total de cuentas creadas.
        return Cuenta.totalCuentas;
    }
    
    public static double truncarDecimales(double num) {
        double truncado = ((int)(num * 100)) / 100.0;
        return truncado;
    }
    
    @Override
    public String toString() {
        double saldoDosDecimales = Cuenta.truncarDecimales(saldo);
        return "\nCUENTA N° " + numero + "\nTitular: " + titular + "\nSaldo: " + saldoDosDecimales;
        
    }
}
