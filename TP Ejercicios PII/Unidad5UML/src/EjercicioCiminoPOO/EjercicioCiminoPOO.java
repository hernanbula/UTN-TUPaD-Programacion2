
package EjercicioCiminoPOO;

/**
 * @author Hernán E. Bula
 * Consignas: https://drive.google.com/file/d/1F-yu4dwmErpJHNosFUCR_uKXZ1zRhugA/
 */

public class EjercicioCiminoPOO {

    public static void main(String[] args) {

        Posnet posnet = new Posnet();
        Cliente cliente1 = new Cliente("Hernán", "Bula", "30300300", "3512345678", "mail@mail.com");
        TarjetaCredito tarj1 = new TarjetaCredito("BNA", "1234 5678 9000", 15000, EntidadFinanciera.BIRZA, cliente1);
        
        System.out.println("Tajeta antes del pago: ");
        System.out.println(tarj1);

        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(tarj1, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tajeta despues del pago: ");
        System.out.println(tarj1);

    } // Fin del main

} // Fin del código
