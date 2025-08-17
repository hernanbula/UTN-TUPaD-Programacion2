package ar.hernanbula.funciones;
import java.util.Scanner;
/**
 * @author Hernán E. Bula
 */
public class FuncionesVoid {

    public static void main(String[] args) {
    
            imprimirSimbolo('x', 5);
            imprimirSimbolo('#', 7);
            imprimirSimbolo('4', 9);
    /*
        
        METODO VOID que NO RETORNA:
        
        static void <nombre_funcion(<parametros>) {
            <instrucciones a ejecutar>
        }
    */      
    
    } // Cierre del main
    
    static void imprimirSimbolo(char simbolo, int veces) {
        
        for (int i = 0; i < veces; i++) {
            System.out.print(simbolo);            
        }
        
        System.out.println(); // Salto de linea
    }
    
} // Cierre de la clase
