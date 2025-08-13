package ar.hernanbula.tp1;

import java.util.Scanner;

/**
 *
 * @author Hernán E. Bula
 */
public class TP1 {

    public static void main(String[] args) {
       
        
//     2. Escribir y ejecutar un programa básico en Java. 
//      a. Creá una clase llamada HolaMundo. 
//      b. Escribe un programa que imprima el mensaje: ¡Hola, Java! 
//      c. Ejecuta el programa en NetBeans y adjunta una captura del resultado en la consola.

    
        System.out.println("Hola Java!");
        
    
//    3. Crea un programa que declare las siguientes variables con valores asignados: 
//        a. String nombre 
//        b. int edad 
//        c. double altura 
//        d. boolean estudiante 
//      Imprime los valores en pantalla usando System.out.println().
            
        String nombre = "Hernán";
        int edad = 42;
        double altura = 1.75; 
        boolean estudiante = true;
            
        System.out.println("Hola " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su altura es: " + altura);
        System.out.println("¿Es estudiante?: " + estudiante);
    
//    4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los muestre en pantalla. Usa Scanner para capturar los datos. 

        Scanner input = new Scanner(System.in);
       
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("El nombre ingresado es: " + nombre);
        System.out.println("La edad ingresada es: " + edad);
    
//    5. Escribe un programa que solicite dos números enteros y realice las siguientes operaciones: 
//      a. Suma 
//      b. Resta 
//      c. Multiplicación 
//      d. División 
//      Muestra los resultados en la consola. 
        
        int suma, resta, producto, num1, num2;
        double division;
        
        System.out.print("Ingrese un número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = (double)num1 / num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + division);
      
        
//    6. Escribe un programa que muestre el siguiente mensaje en consola: Nombre: Juan Pérez 
//      Edad: 30 años 
//      Dirección: "Calle Falsa 123" 
//      Usa caracteres de escape (\n, \") en System.out.println(). 
        
        System.out.println("Nombre: Juan Pérez \nEdad: 30 años \nDirección: \"Calle Falsa 123\"");
    
    
//    7. Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son instrucciones?        //      Explica la diferencia en un breve párrafo. 
//      int x = 10; // Línea 1: Es instrucción
//      x = x + 5; // Línea 2: Es instrucción
//      System.out.println(x); // Línea 3: Es instrucción
//      
//      Las expresiones son fragmentos que evalúan un valor (como x + 5 o 10). En cambio, las instrucciones son órdenes completas que ejecutan algo (como por ejemplo, asignar, declarar o imprimir). En los casos analizados todas son instrucciones, aunque dentro de ellas encontramos que contenienen expresiones (por ejemplo: en x = x + 5;, x + 5 es una expresión dentro de la instrucción).


//    8. Manejar conversiones de tipo y división en Java. 
//      a. Escribe un programa que divida dos números enteros ingresados por el usuario. 
//      b. Modifica el código para usar double en lugar de int y compara los resultados. 
        
        int dividendo, divisor;
        double dividir;
        
        System.out.println("Ingrese un número: ");
        dividendo = input.nextInt();
        System.out.println("Ingrese un número divisor: ");
        divisor = input.nextInt();
        
        dividir = dividendo / divisor;
        System.out.println("El resultado de la división sin decimales es: " + division);
        
        dividir = (double)dividendo / divisor;
        System.out.println("El resultado de la división con decimales es: " + division);
        
    
    
//    9. Corrige el siguiente código para que funcione correctamente. Explica qué error tenía y cómo lo solucionaste. 
//      import java.util.Scanner; 
//      public class ErrorEjemplo { 
//      public static void main(String[] args) { 
//      Scanner scanner = new Scanner(System.in); 
//      System.out.print("Ingresa tu nombre: "); 
//      String nombre = scanner.netxLine(); // ERROR: En lugar de scanner.nextInt() va scanner.nextLine()
//      Ya que no es un numero lo que se ingresa.
//      System.out.println("Hola, " + nombre); 
//          } 
//      } 

    
    
//    10. Completa la tabla de prueba de escritorio para el siguiente código. ¿Cuál es el valor de resultado y por qué? 

                                                    //     -------------------------------------------------------
                                                    //     | Line    |      a      |      b      |   resultado   |
                                                    //     |-----------------------------------------------------|
//    public class PruebaEscritorio {               //     | Line 1  | sin_definir | sin_definir |  sin_definir  |
//    public static void main(String[] args) {      //     | Line 2  | sin_definir | sin_definir |  sin_definir  |
//    int a = 5;                                    //     | Line 3  | sin_iniciar | sin_definir |  sin_definir  |
//    int b = 2;                                    //     | Line 4  |      5      | sin_iniciar |  sin_definir  |
//    int resultado = a / b;                        //     | Line 5  |      5      |      2      |  sin_iniciar  |
//    System.out.println("Resultado: " + resultado);//     | Line 6  |      5      |      2      |       2       | 
//        }                                         //     -------------------------------------------------------
//    } 
//}
      // El resultado es 2 ya que, por defecto, la división en Java da como resultado un entero. 
      // Para una división exacta, se  debe hacer un "casting" o "Promoción de tipos primitivos" con una de las variables.
      // De esta forma, no da como resultado un numero entero, sino que muestra los decimales.

}
    }
