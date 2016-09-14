
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner to get user input
        Scanner input = new Scanner(System.in);
        
        //make an array of numbers
        int[] numbers = new int[3];
        
        //loop through array
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Please enter number " + (i + 1));
            numbers[i] = input.nextInt();
        }
        
        //find product of numbers
        int product = (numbers[0] * numbers[1] * numbers[2]);
        
        //tell user the product
        System.out.println("The product is " + product);
        
        //find square of product
        double squared = Math.pow (product, 2);
        
        //tell users the square of the product
        System.out.println("The square of the product is " + squared);
        
        //find square root of product
        double squareRoot = Math.sqrt (product);
        
        //tell users what the square root of the product is
        System.out.println("The square root of the product is " + squareRoot);
    }
}
