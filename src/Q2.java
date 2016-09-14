
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //scanner 
        Scanner input = new Scanner(System.in);
        
        //setting up an array for the inputted numbers
         double[] num = new double[3];
         
         //for loop for user to enter numbers
         for(int i = 0; i < num.length; i++){
             System.out.println("Please enter number " + (i+1));
             num[i] = input.nextDouble();
             
         }
         //all the math
         double pro = (num[0] * num[1] * num[2]);
        System.out.println("The product is " + pro);
        System.out.println("The product taken to the power of two is " + Math.pow(pro,2));
        System.out.println("The square root of the product is " + Math.sqrt(pro));
    }
}
