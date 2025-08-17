package ar.hernanbula.recursividad;

/**
 * @author Hernán E. Bula
 */
public class Recursividad {

    public static void main(String[] args) {
        
        System.out.println(factorial(4));
        System.out.println(factorialRecursiva(4));
        System.out.println(factR(4));
        
    }
    
    static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    static int factorialRecursiva(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorialRecursiva(num - 1);
        }
    }
    
    static int factR(int num) {
        return num == 0 ? 1 : num * factR(num-1);
    }
}
