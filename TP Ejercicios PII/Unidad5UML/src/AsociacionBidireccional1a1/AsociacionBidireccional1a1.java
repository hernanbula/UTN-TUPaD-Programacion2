package AsociacionBidireccional1a1;

/**
 *
 * @author Hernán E. Bula
 */
public class AsociacionBidireccional1a1 {

    public static void main(String[] args) {
        
        Vehiculo veh1 = new Vehiculo("Automovil", "VW_Nivus");
        
        Patente patente1 = new Patente("AA415FC", 2016);
        
        veh1.setPatente(patente1);
        
        patente1.setVehiculo(veh1);
        
        System.out.println("La matricula " + patente1.getPatente() + " del año " + patente1.getAnio() + ", pertenece al vehículo tipo " + veh1.getTipo() + ", modelo " + veh1.getModelo());

    System.out.println("El vehículo tipo " + veh1.getTipo() + ", modelo " + veh1.getModelo() + ", del año " + patente1.getAnio() + ", posee la matricula " + patente1.getPatente());
    
    }

}
