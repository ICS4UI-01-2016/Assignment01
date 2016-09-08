
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner
        Scanner input = new Scanner(System.in);
        
        // create a string to store the numbers
        double[] numberList = new double[3];
        
        // get the numbers
        for(int i = 0; i < numberList.length; i++) {
            System.out.println("Please enter number " + (i+1));
           numberList[i] = input.nextDouble();
        }
        
        // multiply the numbers
        double total = numberList[0] * numberList[1] * numberList[2];
        
        // find the square of the product
        double square = Math.pow(total, 2);
        
        // find the square root of the product
        double squareRoot = Math.sqrt(total);
        
        // print all the numbers to the screen
        System.out.println("The product is: " + total);
        System.out.println("The square of the product is: " + square);
        System.out.println("The square root of the product is: " + squareRoot);
    }
}
