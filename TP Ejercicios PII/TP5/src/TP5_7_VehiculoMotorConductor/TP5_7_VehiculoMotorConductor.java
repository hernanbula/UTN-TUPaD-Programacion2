
package TP5_7_VehiculoMotorConductor;

/**
 * @author Hernán E. Bula
 * 
 * 7.​ Vehículo - Motor - Conductor
    a.​ Agregación: Vehículo → Motor
    b.​ Asociación bidireccional: Vehículo ↔ Conductor
    Clases y atributos:
        i.​Vehiculo: patente, modelo
        ii.​Motor: tipo, numeroSerie
        iii.​Conductor: nombre, licencia
 */

public class TP5_7_VehiculoMotorConductor {

    public static void main(String[] args) {
        
        Motor motor1 = new Motor("Nafta Turbo 170 TSI", "0987654321");
        Vehiculo veh1 = new Vehiculo("AA415FC", "VW Nivus", motor1);
        Conductor cond1 = new Conductor("Hernán Bula", "1-23456789-0");
        
        System.out.println(cond1);
        
        System.out.println(veh1);
        
        cond1.setVehiculo(veh1);
        
        veh1.setConductor(cond1);
        
        System.out.println(veh1);

    } 

}
