
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a new Scanner to read in values
        Scanner input = new Scanner(System.in);

        // Array of Numbers
        int[] numberList = new int[3];

        // Loop through the array
        for (int i = 0; i < numberList.length; i++) {

            // Output our sentence to the user letting them know what they entered
            System.out.println("Enter a Number: ");
            numberList[i] = input.nextInt();
        }

        // Math for finding the product of numbers entered 
        double numberProduct = (numberList[0] * numberList[1] * numberList[2]);

        // Output our sentence to the user letting them know what they entered
        System.out.println("The Product is: " + numberProduct);

        // Math for squaring the product by 2
        double numberSquare = Math.pow(numberProduct, 2);

        // Output our sentence to the user letting them know what they entered
        System.out.println("The Square of the Product: " + numberSquare);

        // Math for finding the square root of the product
        double numberRoot = Math.sqrt(numberProduct);

        // Output our sentence to the user letting them know what they entered
        System.out.println("The Square Root of the Product: " + numberRoot);

    }
}
