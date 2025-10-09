
package EMUNS;

/**
 * @author Hernán E. Bula
 */

public enum Continente {
    
    
    AMERICA(910000000, 42330000), // Aquí es lo mismo que -> public static final Continente AMERICA = new Continente(910000000, 42330000);
    EUROPA(731000000, 10180000),
    AFRICA(922011000, 30370000),
    ASIA(3879000000l, 43810000),
    OCEANIA(27000000, 8720710),
    ANTARTIDA(1000, 13720000);
    

    private long cantidadHabitantes;
    private long superficie;
    
    private Continente(long cantidadHabitantes, long superficie) { // El constructor SIEMPRE debe ser privado para que tenga sentido el enum, ya que solo están definidos dentro de la clase como constantes. No puede construirse desde afuera de la clase.
        this.cantidadHabitantes = cantidadHabitantes;
        this.superficie = superficie;
    }
    
    // Métodos
    
    public double densidadPoblacion() { 
        return this.cantidadHabitantes / (double) this.superficie;
    }
    
    // Getters y Setters

    public long getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(long cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Continente{" + "ordinal=" + ordinal() + ", name=" + name() + ", cantidadHabitantes=" + cantidadHabitantes + ", superficie=" + superficie + '}';
    }
    
    
}
