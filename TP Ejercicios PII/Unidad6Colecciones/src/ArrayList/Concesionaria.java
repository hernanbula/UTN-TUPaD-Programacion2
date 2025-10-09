package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.Collection;

/**
 * @author Hernán E. Bula
 */
public class Concesionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>(); // No olvidar instanciar el ArrayList en el constructor, sino tendremos un "NullPointerException"
    }

    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
//            for (int i = 0; i < autos.size(); i++) { // De esta manera yo debo conocer los métodos de ArrayList u otra Collection
//                System.out.println(autos.get(i));

            for (Auto auto : autos) { // Ciclo FOR EACH. Recorre la colección "autos" y por cada elemento que encuentre lo va a guardar temporalmente en la variable "auto" de tipo "Auto" (ya que Java es fuertemente tipado y tenemos que poner el tipo de dato.
                System.out.println(auto); // muestra el contenido de "auto" al recorrer cada elemento de la colección "autos"
            }
        }
    }

    public void agregarAutos(Auto auto) {
        this.autos.add(auto);
    }

    public double sumatoriaKmRecorridos() {
        double acumulador = 0;
        for (Auto auto : autos) {
            acumulador += auto.getKm();
        }
        return acumulador;
    }

    public int cantidadAutos() {
        return autos.size();
    }

    public double promedioKmRecorridos() {
//        double promedio = 0;
//        if (cantidadAutos() > 0) { 
//            promedio = sumatoriaKmRecorridos() / cantidadAutos();
//        }
//        return promedio;
        // Todo el código anterior, puede ser reemplazado por el siguiente operador ternario que simplifica la sintaxis:
        return (cantidadAutos() > 0 ? sumatoriaKmRecorridos() / cantidadAutos() : 0);
    }

    // El siguiente método devuelve el auto de la concesionaria con MAS KM recorridos:
    public Auto autoMasKm() {
        Auto autoMasKm = null;
        double kmMax = -1;
        for (Auto auto : autos) {
            if (kmMax < auto.getKm()) {
                kmMax = auto.getKm();
                autoMasKm = auto;
            }
        }
        return autoMasKm;
    }

    // Los siguientes dos métodos generan una lista con todos los autos de la concesionaria con MAS KM recorridos:
    public double masKmRecorridos() {
        double kmMax = -1;
        for (Auto auto : autos) {
            if (kmMax < auto.getKm()) {
                kmMax = auto.getKm();
            }
        }
        return kmMax;
    }

    public ArrayList<Auto> autosMasKm() {
        ArrayList<Auto> listaDeMaximosKm = new ArrayList<>();
        double kmMax = masKmRecorridos();
        for (Auto auto : autos) {
            if (auto.getKm() == kmMax) {
                listaDeMaximosKm.add(auto);
            }
        }
        return listaDeMaximosKm;
    }

    // Podemos evitar recorrer dos veces la misma lista de los metodos anterios de la siguiente manera:
    public ArrayList<Auto> autosConMasKm() {
        ArrayList<Auto> listaDeMaximosKm = new ArrayList<>();
        double kmMax = -1;
        for (Auto auto : autos) {
            if (auto.getKm() == kmMax) {
                listaDeMaximosKm.add(auto);
            } else if (auto.getKm() > kmMax) {
                kmMax = auto.getKm();
                listaDeMaximosKm.clear();
                listaDeMaximosKm.add(auto);
            }
        }
        return listaDeMaximosKm;
    }

    // El siguiente método devuelve el auto de la concesionaria con MENOS KM recorridos:
    public Auto autoMenosKm() {
        Auto autoMenosKm = null;
        double kmMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (kmMin > auto.getKm()) {
                kmMin = auto.getKm();
                autoMenosKm = auto;
            }
        }
        return autoMenosKm;
    }

    // Los siguientes dos métodos generan una lista con todos los autos de la concesionaria con MENOS KM recorridos:
    public double menosKmRecorridos() {
        double kmMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (kmMin > auto.getKm()) {
                kmMin = auto.getKm();
            }
        }
        return kmMin;
    }

    public ArrayList<Auto> autosMenosKm() {
        ArrayList<Auto> listaDeMenosKm = new ArrayList<>();
        double kmMin = menosKmRecorridos();
        for (Auto auto : autos) {
            if (auto.getKm() == kmMin) {
                listaDeMenosKm.add(auto);
            }
        }
        return listaDeMenosKm;
    }

    // Podemos evitar recorrer dos veces la misma lista de los metodos anterios de la siguiente manera:
    public ArrayList<Auto> autosConMenosKm() {
        ArrayList<Auto> listaDeMinimosKm = new ArrayList<>();
        double kmMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKm() == kmMin) {
                listaDeMinimosKm.add(auto);
            } else if (auto.getKm() < kmMin) {
                kmMin = auto.getKm();
                listaDeMinimosKm.clear();
                listaDeMinimosKm.add(auto);
            }
        }
        return listaDeMinimosKm;
    }

    // Esta es una mejor manera de buscar un dato en una colección que con un for each o un for. Pero existe otra mejor con iterador.
  
    public Auto buscarAuto(String patente) {
        Auto autoEncontrado = null;
        int i = 0;
        while (i < cantidadAutos() && !autos.get(i).getPatente().equalsIgnoreCase(patente)) {
            i++;
        }
        if (i < cantidadAutos()) { 
            autoEncontrado = this.autos.get(i);
        }
                return autoEncontrado;
        
    }

    // De la siguiente manera con un "Iterator" es la mejor forma de hacerlo para que funcione independientemente del tipo de colección usada.
    public Auto buscarAutoConIterador(String patente) {
        Auto autoEncontrado = null;
        Iterator<Auto> iter = this.autos.iterator(); // INVESTIGAR MAS USO DE ITERADOR
        while (iter.hasNext() && autoEncontrado == null) {
            Auto auto = iter.next();
            if (auto.getPatente().equalsIgnoreCase(patente)) {
                autoEncontrado = auto;
            }
        }
        return autoEncontrado;
    }
}
