
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add a new scanner
        Scanner input = new Scanner(System.in);

        // Ask for the user to enter the initial amount
        System.out.println("Please enter the initial amount of the bank account.");
        // Store the user's answer
        double initial = input.nextDouble();

        // Ask the user for their bank's interest rate
        System.out.println("Please enter the interest rate as a decimal.");
        // Store the user's interest rate
        double rate = input.nextDouble();

        // Create an integer for the amount of years to double
        int doublingYears = 0;

        // Create an integer for the amount of years to get to $1M
        int millionYears = 0;

        // Create a for loop to calculate when the amount of money will double
        for (double i = initial; i < initial * 2; i += (i * rate)) {
            doublingYears++;
        }

        // Create a for loop to calculate when the user will make $1 million
        for (double i = initial; i < 1e6; i += (i * rate)) {
            millionYears++;
        }
        // Print out the answer
        System.out.println("Therefore your bank account will double in " + doublingYears + " year(s).");
        System.out.println("Therefore your bank account will reach $1 million in " + millionYears + " year(s).");
    }
}
