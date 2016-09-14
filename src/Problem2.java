
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // create an array with a size of 3
        int[] num = new int[3];
        // loop through the array
        for (int i = 0; i < 3; i++) {
            // asks user input for the numbers
            System.out.println("Enter the number:");
            // array to store the number
            num[i] = input.nextInt();
        }
        // calculating product of the three numbers
        int product = num[0]*num[1]*num[2];
        // calculating the square of the product
        double square = Math.pow(product, 2);
        // calculating the square root of the product
        double root = Math.sqrt(product);
        // outputs the product
        System.out.println("Product: " + product);
        // outputs the square
        System.out.println("Square of Product: " + square);
        // outputs the square root
        System.out.println("Square Root of Product: " + root);
    }
}
