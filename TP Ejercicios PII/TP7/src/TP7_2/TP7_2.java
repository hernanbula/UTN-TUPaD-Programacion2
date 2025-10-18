
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

        ArrayList<FigurasGeometricas> figuras = new ArrayList<>();
        
        FigurasGeometricas rect1 = new Rectangulo("Rectangulo", 4.9, 5.7);
        figuras.add(rect1);
        
        figuras.add(new Rectangulo("Rectangulo", 67.9, 1.7));
        
        FigurasGeometricas circ1 = new Circulo("Circulo", 5.7);
        figuras.add(circ1);
        
        figuras.add(new Circulo("Circulo", 43.7));
        
        for (FigurasGeometricas figura : figuras) {
            System.out.println("El área de " + figura.getNombre() +  " es " + figura.calcularArea());
        }
        
    } 

}
