
package EMUNS;

import java.util.Scanner;

/**
 * @author Hernán E. Bula
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Continente[] continente = Continente.values();
        for (int i = 0; i < continente.length; i++) {
            System.out.println(continente[i]);
            
        }
        
        for (int i = 0; i < continente.length; i++) {
            System.out.println("\nLa dendidad de población de " + continente[i].name() + " es: " + (int) continente[i].densidadPoblacion() + " habitantes por Km².");
            
        }
        
        Empresa e = new Empresa("Arcor", Continente.AMERICA);

        e.agregarPersona(new Persona("Pepe", "Fulano", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Maria", "Sultana", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Luis", "Mengano", NivelEstudio.TERCIARIO));
        e.agregarPersona(new Persona("Lito", "García", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Arón", "Quilez", NivelEstudio.PRIMARIO));
        e.agregarPersona(new Persona("Rita", "Perez", NivelEstudio.UNIVERSITARIO));
        e.agregarPersona(new Persona("Alex", "Gomez", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Sara", "Jerez", NivelEstudio.SECUNDARIO));

        System.out.println(NivelEstudio.PRIMARIO.ordinal());
        
        System.out.println(NivelEstudio.PRIMARIO.toString());

        System.out.println("\n --- ELIJA SUS ESTUDIOS--- \n");
        NivelEstudio[] niveles = NivelEstudio.values();
        for (int i = 0; i < niveles.length; i ++) { 
            System.out.println((i+1) + ") " + niveles[i]);
        }
        
        System.out.print("\nIngrese su opción: ");
        int opcionUsuario = Integer.parseInt(input.nextLine());
        System.out.println("\nUsted eligió " + niveles[opcionUsuario - 1] + "\n");
        
        e.mostrarPorNivel(NivelEstudio.SECUNDARIO);
        
        
    }
}
