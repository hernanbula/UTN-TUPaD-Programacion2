
package EjercicioCiminoPOO;

/**
 * @author Hernán E. Bula
 */

class Ticket {
    
    private String nombreApellido;
    private double totalPagar;
    private double montoCuota;
    private int cuotas;

    public Ticket(String nombreApellido, double totalPagar, int cuotas, double montoCuota) {
        this.nombreApellido = nombreApellido;
        this.totalPagar = totalPagar;
        this.cuotas = cuotas;
        this.montoCuota = montoCuota;
    }
    
    public void imprimirTicket() {
        System.out.println("Nombre y Apellido: " + nombreApellido);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Cantidad de cuotas: " + cuotas);
        System.out.println("Monto cada cuota: " + montoCuota);
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", totalPagar=" + totalPagar + ", montoCuota=" + montoCuota + ", cuotas=" + cuotas + '}';
    }
    
    

}
