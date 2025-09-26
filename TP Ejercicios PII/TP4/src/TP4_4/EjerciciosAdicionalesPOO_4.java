
package TP4_4;

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

public class EjerciciosAdicionalesPOO_4 {


    public static void main(String[] args) {
//    1.​ Crear cuentas con ambos constructores.
        Cuenta cta1 = new Cuenta("Hernán Bula");
        Cuenta cta2 = new Cuenta("Enrique Bula", 600000);
        Cuenta cta3 = new Cuenta("Fernan Miras", 1234567.989);
        Cuenta cta4 = new Cuenta("Javiera Mena", 1987654.346);
        Cuenta cta5 = new Cuenta("Fabian Vena");

//    2.​ Probar las dos variantes de consultarSaldo.
        cta1.consultarSaldo();
        cta2.consultarSaldo();
        cta3.consultarSaldo(1368);
        cta4.consultarSaldo(1368);
        cta5.consultarSaldo(1368);
        
//    3.​ Mostrar las cuentas con toString().
        
        System.out.println(cta1);
        System.out.println(cta2);
        System.out.println(cta3);
        System.out.println(cta4);
        System.out.println(cta5);

//    4.​ Mostrar el total de cuentas generadas.

        System.out.println("\nEl total de cuentas generadas es: " + Cuenta.mostrarTotalCuentas());
        
    }

}
