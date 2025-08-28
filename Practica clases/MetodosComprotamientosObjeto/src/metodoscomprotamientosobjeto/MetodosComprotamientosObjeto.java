
package metodoscomprotamientosobjeto;

import java.util.Scanner;

public class MetodosComprotamientosObjeto {

    /*
    @author Hernán E. Bula
    
     */
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.mostrarDatos();
        
//        cb.CBU = "9727532654392109432";
//        cb.alias = "miCuenta";
        
        cb.mostrarDatos();
        
        System.out.println(cb.getSaldo());
        
        cb.depositar(200);

        System.out.println(cb.getSaldo());
        
        cb.setAlias("miNuevoAlias");
        
        System.out.println(cb.getAlias());
        
        System.out.println(cb.saldoDisponible(150));
        
        System.out.println(cb.saldoDisponible(-50));
       
        cb.extraccion(80);
    
    
    } // Fin de main

    
} // Fin de Class
