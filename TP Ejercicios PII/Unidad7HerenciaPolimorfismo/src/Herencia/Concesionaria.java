package Herencia;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Hernán E. Bula
 */
public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        this.vehiculos.add(v);
        // El operador 'instanceof' nos permite conocer si en una variable o parámetro hay una referencia a cierto tipo de dato.
        if (v instanceof Auto) {
            System.out.println("Se agregó un auto a la concesionaria.");
        } else if (v instanceof Moto) {
            System.out.println("Se agregó una moto a la concesionaria.");
        } else if (v instanceof Camion) {
            System.out.println("Se agregó un camión a la concesionaria.");
        }
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void mostrarVehiculosConcesionaria() {
        for (Vehiculo veh : vehiculos) {
            System.out.println(veh);
        }
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "vehiculos=" + vehiculos + '}';
    }

}
