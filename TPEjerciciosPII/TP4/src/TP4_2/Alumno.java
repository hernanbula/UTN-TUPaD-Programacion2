package TP4_2;

/**
 *
 * @author Hernán E. Bula
 *
 */
public class Alumno {

    // CLASE ALUMNO
    // ATRIBUTOS
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6; // (por defecto 6)

    // CONSTRUCTORES sobrecargados:
//        ○ Uno que reciba solo el nombre (promedio = 0).
    public Alumno(String nombre) {
        this(nombre, 0);
    }
//        ○ Otro que reciba nombre y promedio.

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

//      MÉTODOS 
//      Sobrecargados:
//        ○ Uno que reciba un nuevo promedio.
    public void actualizarPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }

//        ○ Otro que reciba un array de notas, y calcule el promedio.
    public void actualizarPromedio(double[] notas) {
        double prom, acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            acumulador += notas[i];
            System.out.println(acumulador);
        }
        prom = acumulador / notas.length;
        System.out.println(prom);
        promedio = prom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public static double getNotaAprobacion() {
        return notaAprobacion;
    }

    public static void setNotaAprobacion(double notaAprobacion) {
        Alumno.notaAprobacion = notaAprobacion;
    }

//        ○ Método aprobo(): retorna true si el promedio ≥ notaAprobacion.
    public boolean aprobo() {
        if (promedio >= Alumno.notaAprobacion) {
            return true;
        } else {
            return false;
        }
    }

//        ○ Método estático cambiarNotaAprobacion(double nueva): cambia la nota mínima para aprobar.
    public static void cambiarNotaAprobacion(double nuevaNota) {
        Alumno.notaAprobacion = nuevaNota;
        System.out.println("\nLa nueva nota para aprobar es: " + Alumno.notaAprobacion);
    }

//        ○ Método toString(): mostrar nombre, promedio y si aprueba o no.
    @Override
    public String toString() {
        return "\nALUMNO\nNombre: " + nombre + "\nPromedio: " + promedio + "\nAprueba: " + aprobo();
    }
}
