
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner (System.in);
        
        // create an array to store the numbers
        int[] numbers = new int [3];
        
        // tell user to enter first number
        System.out.println("Please enter the first number." );
        // store the first number in array
        numbers[0] = input.nextInt();
        
        // tell the user to enter the second number
        System.out.println("Please enter the second number.");
        // store the second number in array
        numbers[1] = input.nextInt();
        
        // tell the user to enter the third number
        System.out.println("Please enter the third number.");
        // store the third number in the array
        numbers[2] = input.nextInt();
            
        // multiply all the numbers in the array together
        // store the product in a variable
        int p = numbers[0]*numbers[1]*numbers[2];
        
        // tell user the product of all the numbers they entered
        System.out.println("The product is " + p + ".");
        
        // find the square of the product
        // store in a variable
        double sq = Math.pow(p, 2);
        
        // tell user the square of the product
        System.out.println("The square of the product is " + sq + ".");
        
        // find the square root of the product
        // store the root in a new variable
        double sqr = Math.sqrt(p);
        
        // tell user the root of the product
        System.out.println("The root of the product is " + sqr + ".");
        
        // close the scanner
        input.close();
        }
    }

