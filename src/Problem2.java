
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Add an array
        int[] nums = new int[3];

        // For loop that goes through array 
        for (int i = 0; i < nums.length; i++) {
            // Ask the user for their three numbers
            System.out.println("Please entire a number.");
            nums[i] = input.nextInt();
        }

        // Answering the user 
        int product = nums[0] * nums[1] * nums[2];
        System.out.println("Your product is " + product + ".'");
        System.out.println("The square of your product is " + (product * product) + ".");
        System.out.println("The square root of the product is " + (Math.sqrt(product)) + ".");
    }
}
