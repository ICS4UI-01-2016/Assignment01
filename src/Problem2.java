
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner input = new Scanner(System.in);
        
        //ask for the user to input 3 numbers
        System.out.println("Please input three numbers.");
        
        //make an array to store the numbers in
        double[] numbs = new double[3];
        
        //user enters three numbers
        for(int i = 0; i < 3; i++){
            System.out.println("Please enter number " + (i + 1));
            numbs[i] = input.nextDouble();
        }
        
        //find the product of the three numbers
        double product = numbs[0] * numbs[1] * numbs[2];
        System.out.println("The product is " + product);
        
        //find the square root of the product
        double root = Math.sqrt(product);
        System.out.println("The square root of the product is " + root);
        
        //find the square of the product
        double square = Math.pow(product, 2);
        System.out.println("The square of the product is " + square);
        
        
    }
}
