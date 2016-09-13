
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add a new scanner
        Scanner input = new Scanner(System.in);

        // Ask for food prices
        System.out.println("What is the price of food?");
        // Save the user's input
        double food = input.nextDouble();

        // Ask for price of DJ
        System.out.println("What is the price of the DJ?");
        // Save the user's input
        double dj = input.nextDouble();

        // Ask for the price of the hall rental 
        System.out.println("What is the price of the hall rental?");
        // Save the user's input
        double hall = input.nextDouble();

        // Ask for the price of the decorations
        System.out.println("What is the price of the decorations?");
        // Save the user's input
        double decorations = input.nextDouble();

        // Ask for the price of the wait staff
        System.out.println("What is the price of the wait staff?");
        // Save the user's input
        double staff = input.nextDouble();

        // Ask for for any miscellaneous expenses 
        System.out.println("What is the price for any miscellaneous expenses?");
        // Save the user's input
        double miscellaneous = input.nextDouble();

        // Calculating the total costs 
        double total = (double) ((food + dj + hall + decorations + staff + miscellaneous));
        // Calculating the entire amount of tickets to sell
        double tickets = (double) (total / 35);

        // Print out the total amount the party will cost and how many tickets will be needed to be sold
        System.out.println("Your party will cost you $" + Math.ceil(total) + " and you'll need to sell " + Math.ceil(tickets) + " tickets.");
    }
}
