
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
        // Add a new scanner 
        Scanner input = new Scanner(System.in);
        // Add an array and store the user's input
        int[] nums = new int[3];

        // For loop that goes through array and asks the user for three numbers
        for (int i = 0; i < nums.length; i++) {
            // Ask the user for their three numbers
            System.out.println("Please entire a number.");
            // Store the user's entered number but within the array method 
            nums[i] = input.nextInt();
        }

        // Calculate the product 
        int product = nums[0] * nums[1] * nums[2];
        // Print to the user the answer (the product of their numbers)
        System.out.println("The product is " + product + ".");
        // Print to the user the answer (the square of the product)
        System.out.println("The square of your product is " + (Math.pow(product, 2)) + ".");
        // Print to the user the answer (the square root of the product)
        System.out.println("The square root of the product is " + (Math.sqrt(product)) + ".");
    }
}
