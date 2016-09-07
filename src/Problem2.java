
import java.util.Scanner;

/*
 * Create a program that accepts the users input of three numbers.
 * Then calculates the product of three numbers.
 * Finally calculates the square and square root of that initial product.
 */

/**
 *
 * @author richj0985
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // make an array of numbers
        double[] numberList = new double[3];
        
        // make a variable that holds the product of the array of numbers
        double product = 1;
        
        // loop throught the array to accept the users input and find the
        // product of the numbers
        for(int i = 0; i < numberList.length; i++){
            // ask for the numbers and collect input
            System.out.println("Please enter number " + (i+1));
            numberList[i] = input.nextInt();
            // multiply number by the product
            product = numberList[i] * product;
        }
        
        // output the product
        System.out.println("The product of the numbers is " + product);
        
        // output the square of the product
        double squareProduct = Math.pow(product, 2);
        System.out.println("The Square of the Product is " + squareProduct);
        
        // output the squareroot of the product
        double squareRootProduct = Math.sqrt(product);
        System.out.println("The Square Root of the Product is " + squareProduct);
        
        // close scanner
        input.close();
    }
}
