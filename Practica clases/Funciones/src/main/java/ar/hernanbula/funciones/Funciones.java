package ar.hernanbula.funciones;
import java.util.Scanner;
/**
 * @author Hernán E. Bula
 */
public class Funciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = siguiente(8);
        System.out.println(x);
        
        // Cual es el siguiente?
        System.out.println(siguiente(0));
        System.out.println(siguiente(-4));
        System.out.println(siguiente(15));
        
        // Cuál es el doble del siguiente de 9?
        
        // Con variables
        int siguienteDe9 = siguiente(9);
        int dobleSiguiente = doble(siguienteDe9);
        System.out.println(dobleSiguiente);
        
        // Con composición de funciones
        System.out.println(doble(siguiente(9)));
        
        // Funciones con multiples parámetros
        System.out.println(obtenerResto(20,4));
        
        System.out.println("Ingrese dos numeros para saber si son múltiplos entre si.");
        
        System.out.print("Ingresa un n°: ");
        int num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa otro n°: ");
        int num2 = Integer.parseInt(input.nextLine());
        
        if (esMultiplo(num1,num2)) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " no es multiplo de " + num2);
            
        }
        
        /*
        
        Sintaxis de una función en Java (método):
        
        METODO que RETORNA:
        
        static <tipo_retorno> <nombre_funcion(<parametros>) {
            <instrucciones a ejecutar>
            return <valor a retornar>
        }
        
        METODO que NO RETORNA:
        
        static void <nombre_funcion(<parametros>) {
            <instrucciones a ejecutar>
        }
         */      

        
    } // Cierre main
    
    /**
     * Método que sirve para leer un entero entre un mínimo y un máximo. Si no se ingresa un número válido, marca ERROR y vuelve a solicitarlo.
     * @param mensaje Este parámetro sirve para recibir una cadena de caracteres con el mesaje que queremos colocar al solicitar el número.
     * @param min Valor mínimo del rango solicitado.
     * @param max Valor máximo del rango solicitado.
     * @return El valor ingresado por el usuario luego de validarlo en el rango.
     */
    
    static int leerEnteroEntre(String mensaje, int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine());
        while (x < min || x > max) {
            System.out.println("ERROR. " + mensaje + ": ");
        x = Integer.parseInt(input.nextLine());
        }
        return x;
    }
            
            
    static int siguiente(int num) {
        return num + 1;
    }
    
    static int doble(int num) {
        return num * 2;
    }
    
    static int obtenerResto(int dividendo,int divisor){
        // dividendo - divisor * cociente
        int cociente = dividendo / divisor;
        return dividendo - divisor * cociente;
        // es lo mismo que: return dividendo % divisor;
    }
    
    static boolean esMultiplo(int a, int b){
        return obtenerResto(a, b) == 0;
    }
    
} 
// Cierre de clase
