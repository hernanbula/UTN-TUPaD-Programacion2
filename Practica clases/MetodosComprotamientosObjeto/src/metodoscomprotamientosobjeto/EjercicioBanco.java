
package metodoscomprotamientosobjeto;

public class EjercicioBanco {

    
    public static void main(String[] args) {

        CuentaBancaria cb1 = new CuentaBancaria("miAlias1", "Pesos", "Caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria("Dólares", "Caja de ahorro");
        CuentaBancaria cb3 = new CuentaBancaria();

//        cb1.mostrarDatos();
//        cb2.mostrarDatos();
//        cb3.mostrarDatos();   
        
        System.out.println(cb1);
        System.out.println(cb2);
        System.out.println(cb3);
        
        String datosCuenta1 = cb1.toString(); // toString() puede usarse también como método para obtener los datos.
        System.out.println(datosCuenta1);
    
    }

}
