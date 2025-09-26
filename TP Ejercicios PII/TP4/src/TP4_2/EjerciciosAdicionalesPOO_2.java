package TP4_2;

/**
 *
 * @author Hernán E. Bula
 *
 * Caso Práctico 2 Sistema de Alumnos con Nota de Aprobación
 *
 * CLASE ALUMNO Atributos: ● String nombre ● double promedio ● static double
 * notaAprobacion (por defecto 6)
 *
 * REQUERIMIENTOS 1. Uso de this: ○ Utilizar this en los constructores para
 * distinguir parámetros de atributos. 2. Encapsulamiento: ○ Todos los atributos
 * de la clase deben ser private. Proporcionar los métodos get y set públicos
 * (public) necesarios para acceder o modificar los atributos, excepto aquellos
 * que no deberían ser alterados desde fuera de la clase. 3. Constructores
 * sobrecargados: ○ Uno que reciba solo el nombre (promedio = 0). ○ Otro que
 * reciba nombre y promedio. 4. Métodos sobrecargados actualizarPromedio: ○ Uno
 * que reciba un nuevo promedio. ○ Otro que reciba un array de notas, y calcule
 * el promedio. 5. Método aprobo(): retorna true si el promedio ≥
 * notaAprobacion. 6. Método estático cambiarNotaAprobacion(double nueva):
 * cambia la nota mínima para aprobar. 7. Método toString(): mostrar nombre,
 * promedio y si aprueba o no.
 *
 * TAREAS A REALIZAR 1. Crear varios alumnos con ambos constructores. 2.
 * Actualizar promedios con las dos variantes de método. 3. Imprimir resultados
 * y verificar quién aprueba. 4. Cambiar la nota de aprobación y volver a
 * probar.
 *
 */
public class EjerciciosAdicionalesPOO_2 {

    public static void main(String[] args) {
//    1. Crear varios alumnos con ambos constructores.

        Alumno al1 = new Alumno("Hernán Bula");
        Alumno al2 = new Alumno("Enrique Bula", 8);
        Alumno al3 = new Alumno("Her Bulapa");
        Alumno al4 = new Alumno("Fernando Bula", 10);

//    2. Actualizar promedios con las dos variantes de método.
        al1.actualizarPromedio(6);
        double[] notas2 = {7, 3, 4};
        al2.actualizarPromedio(notas2);
        double[] notas3 = {10, 9, 10, 8};
        al3.actualizarPromedio(notas3);

//    3. Imprimir resultados y verificar quién aprueba.
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al3);
        System.out.println(al4);

//    4. Cambiar la nota de aprobación y volver a probar.
        Alumno.cambiarNotaAprobacion(4);
        System.out.println(al2);
    }

}
