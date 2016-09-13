
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joudn2217
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int product = 1;
        //create a product variable to store the product of the digits multipled in the for loop
        int[] number;
        number = new int[3];
        //create an array to store the 3 numbers inputted
        Scanner in = new Scanner(System.in);
        //create a scanner to fetch the inputted numbers
        System.out.println("Input 3 numbers");
        //prompt user for 3 numbers
        for (int i = 0; i <= 2; i++) {
            number[i] = in.nextInt();
        }
        //save inputted numbers in the array
        for (int i = 0; i <= 2; i++) {
            product = product * number[i];
        }
        //ca;culate the product
        System.out.println("The product is " + product);
        //output product
        double square = Math.pow(product, 2);
        //square the product
        System.out.println("The sqaure of the product is " + square);
        //output the square
        double squroot = Math.sqrt(product);
        //calculate the square root 
        System.out.println("The square root of the product is " + squroot);
        //output the square root
    }
}