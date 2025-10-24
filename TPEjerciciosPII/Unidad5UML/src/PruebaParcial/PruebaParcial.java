        
package PruebaParcial;

/**
 * @author Hernán E. Bula
 */

public class PruebaParcial {
    
    public static void main(String[] args) {
        
        int[][] m = {{1,2},{3,4},{-1,5}};
        int s = 0;
        for (int i=0; i<m.length; i++) { 
            for (int j=0; j<=m[i].length;j++) {
                s +=m[i][j];
            }
        }
        System.out.println(s);
        
    }
                
    } 
