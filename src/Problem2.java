
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //create array to store numbers
        double[] numbers = new double[3];

        //ask user for numbers
        System.out.println("Enter in 3 Numbers:");

        //store numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        //find the product of all the numbers
        double product = (numbers[0] * numbers[1] * numbers[2]);

        //print the product
        System.out.println("The product of the numbers " + product);
        //find square root of product and print
        System.out.println("The Square of the product is " + Math.sqrt(product));
        //square the product and print
        System.out.println("The product squared is " + Math.pow(product, 2));

    }
}