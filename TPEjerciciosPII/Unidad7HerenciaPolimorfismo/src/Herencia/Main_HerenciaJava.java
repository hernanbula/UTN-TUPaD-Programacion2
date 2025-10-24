package Herencia;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 */
public class Main_HerenciaJava { // Main

    public static void main(String[] args) {
        
        Concesionaria cons = new Concesionaria();

        //private ArrayList<Vehiculo> vehiculos;

        cons.agregarVehiculo(new Camion(50, "XXX", "Generico", "EF123GH"));
        
        cons.agregarVehiculo(new Auto(true, "VW", "Nivus", "AB123CD"));
        
        
        cons.agregarVehiculo(new Moto(40, "Kawasaki", "M1000", "OHG789"));
        
        cons.agregarVehiculo(new Camion(20, "Scannia", "GF234", "AH123CD")); 
        
        cons.agregarVehiculo(new Auto(true, "Fiat", "Cronos", "CG123CD")); // Generalización / Casting o promoción de tipos
        
        // GENERALIZACIÓN o UPCASTING implica tratar al objeto como si fuera de un tipo más alto 
        // en la jerarquía de herencia
        
        System.out.println("+".repeat(40));
        Auto auto1 = new Auto(true, "Ford", "Fiesta", "CD123CD");
        
        auto1.acelerar();
        System.out.println(auto1);
        auto1.prenderAire();
        
        Vehiculo veh1 = auto1;
        
        veh1.acelerar();
        System.out.println(veh1);
        // veh1.prenderAire(); Al generalizar, perdemos la capacidad de llamar métodos 
        // que sean de la subclase
        
        cons.agregarVehiculo(veh1);
       
        cons.mostrarVehiculosConcesionaria();
    }
}
