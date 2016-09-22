
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //making a new scanner to detect inputs by the user
        Scanner input = new Scanner(System.in);
        //making a new number array
        int[] numList = new int[3];
        //tells the user to enter a number
        System.out.println("Please enter a number.");
        //places the number into the first spot in the array
        numList[0] = input.nextInt();
        //tells the user to enter a number
        System.out.println("Please enter a number.");
        //places the number into the second spot in the array
        numList[1] = input.nextInt();
        //tells the user to enter a number
        System.out.println("Please enter a number.");
        //places the number into the third spot in the array
        numList[2] = input.nextInt();
        //multiplies the numbers in the array
        int product = numList[0] * numList[1] * numList[2];
        //tells the user the product
        System.out.println("The product of the three numbers is " + product);
        //gets the square of the product
        double power = Math.pow(product, 2);
        //tells the user the square of the product
        System.out.println("The square of the product is " + power);
        //gets the square root of the product
        double squirt = Math.sqrt(product);
        //tells the user the square root of the product
        System.out.println("The square root of the product is " + squirt);
        
        
        
    }
}
