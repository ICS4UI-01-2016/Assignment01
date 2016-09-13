
import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create an array of integers
        int[] numbers;

        //the array has 3 slots
        numbers = new int[3];

        //ask the user for 3 numbers
        System.out.println("Please input 3 numbers");

        //create a scanner
        Scanner in = new Scanner(System.in);

        //input the first number
        numbers[0] = in.nextInt();

        //input the second number
        numbers[1] = in.nextInt();

        //input the last number
        numbers[2] = in.nextInt();

        //find the product of the 3 numbers
        int product = (numbers[0] * numbers[1] * numbers[2]);

        //find the square of the product
        double square = Math.pow(product, 2);

        //find the root of the product
        double root = Math.sqrt(product);

        //output the product
        System.out.println("the product is " + product);

        //output the square of the product
        System.out.println("the square of the product is " + square);

        //output the root of the product
        System.out.println("the root of the product is " + root);
    }
}
