
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

        // Ask for the user to insert the initial amount
        System.out.println("Please enter the initial amount of the bank account.");
        // Store the user's answer
        double initial = input.nextInt();

        // Ask the user for their bank's interest rate
        System.out.println("Please enter the interest rate.");
        // Ask for the user for the annual rate of interest
        double rate = input.nextInt();

        // Integers for the doubing years and million years
        int doubling = 0;
        int million = 0;

        // Calculating the doubling amount of the user's bank amount
        for (double x = initial; x < initial * 2; x += (x * rate)) {
            doubling++;
        }

        // Calculating when the banker's initial amount will reach $1M
        for (double x = initial; x < 1000000; x += (x * rate)) {
            million++;
        }

        // Print the user's amount of years to double 
        System.out.println("Your account will double in " + doubling + " year(s).");
        // Print when the user will make a million dollars
        System.out.println("Your account will reach $1M in " + million + " year(s).");
    }
}
