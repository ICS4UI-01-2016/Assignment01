
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // To get user input
        Scanner input = new Scanner (System.in);
        
        // Loop through the array
        double[] number = new double [3];
        for(int i = 0; i < number.length; i++){
        System.out.println("Please enter number " + (i+1) );
        number[i] = input.nextDouble();
        
    }
        //total the products and give all the numbers out
        double total = (number[0] * number[1] * number[2]);
        System.out.println(" The product is " + total);
        System.out.println(" The square of the product is " + Math.pow (total,2));
        System.out.println(" The square root of the product is " + Math.sqrt (total));
    }
}
