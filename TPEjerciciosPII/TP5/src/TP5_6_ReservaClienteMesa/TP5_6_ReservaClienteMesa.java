package TP5_6_ReservaClienteMesa;

/**
 * @author Hernán E. Bula
 * 
 * 6.​ Reserva - Cliente - Mesa
    a.​ Asociación unidireccional: Reserva → Cliente
    b.​ Agregación: Reserva → Mesa
    Clases y atributos:
        i.Reserva: fecha, hora
        ii.Cliente: nombre, telefono
        iii.Mesa: numero, capacidad
 */

public class TP5_6_ReservaClienteMesa {

    public static void main(String[] args) {

        Mesa mesa1 = new Mesa(1, 6);
        Mesa mesa2 = new Mesa(2, 4);
        Mesa mesa3 = new Mesa(3, 2);
        
        Cliente cliente1 = new Cliente("Hernan Bula", "12345678");
        Cliente cliente2 = new Cliente("Hernan Bula", "12345678");
        Cliente cliente3 = new Cliente("Hernan Bula", "12345678");
        
        Reserva res1 = new Reserva("2025-09-20", "13-30", mesa1); // Agregación
        res1.setCliente(cliente2); // Asociación unidireccional
        
        Reserva res2 = new Reserva("2025-09-21", "14-00", mesa2);
        res2.setCliente(cliente3);
        
        Reserva res3 = new Reserva("2025-09-20", "13-00", mesa3);
        res3.setCliente(cliente1);
        
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        
    } 

}
