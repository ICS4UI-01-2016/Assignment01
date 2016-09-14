
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // asks user input for initial amount
        System.out.println("Enter the initial amount:");
        // variable to store the number
        double initial = input.nextDouble();
        // asks user input for interest rate in decimal form
        System.out.println("Enter the interest rate in decimal form:");
        // variable to store the number
        double rate = input.nextDouble();
        // variable to store how many years for balance to double
        int year1 = 0;
        // variable to store how many years for balance to reach 1 million
        int year2 = 0;      
        // while loop
        while (true) {
            // using a formula to calculate the interest on top of the initial amount
            double answer = Math.pow((1+rate), year2);
            double balance = answer*initial;
            // if balance is less than or equal to double the initial amount
            if (balance <= (2 * initial)) {
                // increase year1 by 1
                year1++;                
            }          
            // if balance is less than or equal to 1 million
            if (balance <= 1000000) { 
                // increase year2 by 1
                year2++;
            }
            // if balance exceeds 1 million
            if (balance > 1000000) {
                // end the loop
                break;
            }         
        }
        // outputs the answers
        System.out.println("It takes " + year1 + " years to double and " + year2 + " years to reach 1 million");
    }
}
