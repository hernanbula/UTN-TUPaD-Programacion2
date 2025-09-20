
package TP5_5_ComputadoraPlacaPropietario;

/**
 * @author Hernán E. Bula
 * 
 * 5.​ Computadora - PlacaMadre - Propietario
    a.​ Composición: Computadora → PlacaMadre
    b.​ Asociación bidireccional: Computadora ↔ Propietario
    Clases y atributos:
        i.Computadora: marca, numeroSerie
        ii.PlacaMadre: modelo, chipset
        iii.Propietario: nombre, dni
 */

public class TP5_5_ComputadoraPlacaPropietario {

    public static void main(String[] args) {

        Computadora compu1 = new Computadora("IBM", "09876", "AMD", "B650");
        Propietario prop1 = new Propietario("Hernán Bula", "12345678");
        
        System.out.println(prop1);
        System.out.println(compu1);
        
        prop1.setComputadora(compu1);
        compu1.setPropietario(prop1); // Como en la linea anterior ya fue asociada la computadora al propietario, en esta linea no se hace nada. Pero es para asegurar que no se genera un bucle infinito.
        
        System.out.println(prop1);
        
        System.out.println(compu1); // Imprimo otra vez para asegurarme que no se hace un bucle infinito.
        
    } 

}
