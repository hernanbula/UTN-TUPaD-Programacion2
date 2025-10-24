
package EMUNS;

/**
 * @author Hernán E. Bula
 */

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private Continente continente;
    private ArrayList<Persona> listaPersonas;

    public Empresa(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.listaPersonas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void agregarPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    public void mostrarPorNivel(NivelEstudio nivel) {
        for (Persona p : listaPersonas) {
            if (p.getNivelEstudio() == nivel) {
                System.out.println(p);
            }
        }
    }
}