
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question2 {
    public static void main(String[] args) {
        //User input 
        Scanner input = new Scanner(System.in);
        
        //array used for having 3 slots
        int[] number = new int[3];
        
        //assign numbers to arrays
        System.out.println("Please enter 3 numbers");
        for (int i = 0; i < number.length; i++) {
            int numberz = input.nextInt();
            number[i] = numberz;
            
        }
        //takes the first slot
        double product = number[0];
        //Multiplies product with the 2 other numbers
        for (int i = 1; i < number.length; i++) {
            product = product * number[i];
           
        }
        //prints out the results
         System.out.println("The product is " + product);
         System.out.println("The square of product " + Math.pow(product,2) );
         System.out.println("The square root of " + Math.sqrt(product));
        
    }
}
