package parcial;

/**
 * @author Hernán E. Bula
 */
public class PARCIAL {

//    public static void main(String[] args) {
//        String tipo = "Planta";
//        double altura = 1.3;
//        boolean tieneFrutos = true;
//
//        String reporte = "Reporte de Planta: \n";
//        reporte += "Tipo: " + tipo + "\n";
//        reporte += "Altura: " + altura + " cm\n";
//
//        String estadoFrutos;
//        if (tieneFrutos) {
//            estadoFrutos = "Sí";
//        } else {
//            estadoFrutos = "No";
//        }
//        
//        reporte += "Tiene frutos: " + estadoFrutos;
//        
//        System.out.println(reporte);
//        
//        int codigoSocio = 3;
//        String nombreSocio = "Bula";
//        
//        if (codigoSocio > 0) {
//            String mensaje = nombreSocio + " registrado con código: " + codigoSocio;
//            System.out.println(mensaje);
//        }
    
   
    // Complete el código para una relación 1:1 entre Libro y FichaCatalografica.


public class FichaCatalografica {
    private String codigoUbicacion;
    
    public FichaCatalografica(String codigo){ 
      	this.codigoUbicacion = codigo; 
    }
        
    public String getCodigoUbicacion(){ 
    	return this.codigoUbicacion; 
    }
}

public class Libro {
    private String titulo;
    private FichaCatalografica ficha;

    public Libro(String titulo, String codigoFicha) {
        this.titulo = titulo;
        this.ficha = new FichaCatalografica(codigoFicha);
    }

    public void imprimirUbicacion() {
        System.out.println("Ubicación de '" + this.titulo + "': " + this.ficha.getCodigoUbicacion());
    }
}
        
// Un Libro __________ una FichaCatalografica. En UML, la composición se representa con un rombo relleno.

OPCIONES: implementa / contiene una referencia / hereda / es un tipo de

        } // Fin del main

    } // Fin de la clase
