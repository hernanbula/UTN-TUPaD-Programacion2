
package TP7_2;

import java.util.ArrayList;

/**
 * @author Hernán E. Bula
 * 
 * 2. Figuras geométricas y métodos abstractos
    ● Clase abstracta: Figura con método calcularArea() y atributo nombre
    ● Subclases: Círculo y Rectángulo implementan el cálculo del área
    ● Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo. 
 */

public class TP7_2 {

    public static void main(String[] args) {

        // Creamos una lista de figuras con un ArrayList
        ArrayList<FigurasGeometricas> figuras = new ArrayList<>();
        
        // Creamos y añadimos figuras a la lista instanciando antes y en el momento
        FigurasGeometricas rect1 = new Rectangulo("Rectangulo", 4.9, 5.7);
        figuras.add(rect1);
        
        figuras.add(new Rectangulo("Rectangulo", 67.9, 1.7));
        
        FigurasGeometricas circ1 = new Circulo("Circulo", 5.7);
        figuras.add(circ1);
        
        figuras.add(new Circulo("Circulo", 43.7));
        
        // Recorremos el ArrayList t llamamos al método calcularArea() para imprimir los datos
        for (FigurasGeometricas figura : figuras) {
            System.out.println("El área de " + figura.getNombre() +  " es " + figura.calcularArea());
        }
        
    } 

}
