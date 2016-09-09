
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

    }
}
