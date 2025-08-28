
package tp3;

/**
 *
 * @author Hernán E. Bula
 * 
    5. Simulación de Nave Espacial
        Crear una clase NaveEspacial con los atributos: nombre, combustible.
        Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
        Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
        Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente                   Mostrar el estado al final.

     */

public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private int distancia = 0;
    private double distanciaTotal = 0;
    private boolean finalMision;
    
    
    public void setNaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        System.out.println("\nNave Espacial " + nombre + " en posición para la misión. \nDebe cargar combustible.\n");
    }
    
    public void despegar() {
        if (combustible >= 250) {
            System.out.println("3... 2... 1... ¡¡¡Despegue!!! \n");
            combustible -= 200;
            distanciaTotal += 1.5;
        } else {
            System.out.println("¡ATENCIÓN! Intento de despegue fallido. Debe cargar más combustible para poder despegar (mínimo 250 mil galones).\n");
        }
    }
    
    public void avanzar(int distancia) {
        if (combustible >= 80) {
            System.out.println("Avanzando " + distancia + " UA (Unidades Astronómicas). Equivalente a " + (distancia*150) + " millones de km.\n");
            combustible -= (distancia*5); // Si la nave avanza, consume combustible. 
            distanciaTotal += distancia;
            finalMision = true;
        } else {
            System.out.println("¡ATENCIÓN! Intento de avanzar fallido. ");
            System.out.println("Total en depósitos: " + combustible + " mil galones");
            System.out.println("Debe cargar más combustible para poder avanzar (mínimo 80 mil galones).\n");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        combustible += cantidad;
        System.out.println("Se cargaron " + cantidad + " mil galones de combustible.");
        // 80.000 galones (aproximadamente 300 mil litros) de oxígeno líquido y queroseno para su lanzamiento.
        System.out.println("Total en depósitos: " + combustible + " mil galones (" + ((double)combustible * 3.75) + " mil litros) de combustible.\n");
    }
    
    public String getNombreNave() {
        System.out.println("Nombre de la nave: " + nombre);
        return nombre;
    }

    public double getDistanciaRecorrida() {
        System.out.println("Distancia recorrida: " + distanciaTotal + " UA (" + (distanciaTotal*150) + " millones de Km).");
        return distanciaTotal;
    }
    
    public int getCombustibleDepósitos() {
        System.out.println("Combustible en depósitos: " + combustible + " mil galones (" + ((double)combustible * 3.75) + " mil litros) de combustible.");
        return combustible;
    }
    
    public void mostrarEstado() {
        System.out.println("ESTADO FINAL DE LA MISIÓN");
        getNombreNave();
        getDistanciaRecorrida();
        getCombustibleDepósitos();
        if (finalMision) {
            System.out.println("Misión completa: Retorno a la Tierra: ¡Exitoso!\n");
        } else {
            System.out.println("Misión incompleta. La nave no retornó a la Tierra.\n");
        }
        System.out.println();
    }
}
