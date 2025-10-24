
package Asociacion1a1Unidireccional;

/**
 *
 * @author Hernán E. Bula
 *
*/ 

public class Asociacion1a1Unidireccional {

    public static void main(String[] args) {
        
        Persona pers1 = new Persona("Hernán", "Bula");
        
        Pasaporte pasap1 = new Pasaporte("12345678", "Argentina");
        
        pers1.mostrarPasaporte();
        
        pers1.setPasaporte(pasap1);
        
        pers1.mostrarPasaporte();
        
        
    }

}
