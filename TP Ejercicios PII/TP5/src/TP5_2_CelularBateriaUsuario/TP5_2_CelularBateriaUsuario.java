
package TP5_2_CelularBateriaUsuario;

/**
 * @author Hernán E. Bula
 * 
 * 2. Celular - Batería - Usuario
        a. Agregación: Celular → Batería
        b. Asociación bidireccional: Celular ↔ Usuario
    Clases y atributos:
        i. Celular: imei, marca, modelo
        ii. Batería: modelo, capacidad
        iii. Usuario: nombre, dni
* 
 */

public class TP5_2_CelularBateriaUsuario {

    public static void main(String[] args) {
        
        Bateria bateria1 = new Bateria("Batería de iones de litio", "5.000mAh, 45W carga rápida.");
        Celular celular1 = new Celular("350693902637196", "Samsung", "Galaxy S25 Ultra",bateria1);
        Usuario usuario1 = new Usuario("Hernán Bula", "1234567");
        
        usuario1.setCelular(celular1);
        
        celular1.setUsuario(usuario1);
        
        System.out.println(usuario1);
        System.out.println(celular1);
        System.out.println(bateria1);
        
        celular1.mostrarBateria();
        usuario1.mostrarUsuario();
        celular1.mostrarCelular();

    } 

}
