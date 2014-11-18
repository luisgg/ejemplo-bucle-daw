/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bucle;

/**
 *
 * @author lgarciag
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int b = 5;
    int h = 3;
    int x = 0;
    int p = 0;
    
    p = 2*(b + h);
    
    while( x < 20 ) {
        x += 2;
        System.out.println( 2*x+5 );
    }
    System.out.println("Perimetro:"+ p);
  }
}