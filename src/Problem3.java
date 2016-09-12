
import java.util.Scanner;

/*
 * Create a program that asks for the different expenses of a prom night and
 * and then adds those expenses to output how many $35 tickets you must sell
 * inorder to break even.
 */

/**
 *
 * @author richj0985
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // ask the user for the different expenses and collect that data
        // through different variables
        System.out.println("What is the expense of the Food?");
        double food = input.nextDouble();
        System.out.println("What is the expense of the DJ?");
        double dj = input.nextDouble();
        System.out.println("What is the expense of the Hall Rentals?");
        double hallRentals = input.nextDouble();
        System.out.println("What is the expense of the Decorations?");
        double decorations = input.nextDouble();
        System.out.println("What is the expense of the Wait Staff?");
        double waitStaff = input.nextDouble();
        System.out.println("What are any Miscellaneous expenses?");
        double other = input.nextDouble();
        
        // calculate and output the sum of the different expenses
        double total = food + dj + hallRentals + decorations + waitStaff + other;
        System.out.println("The total cost of prom is " + total);
        
        // divide the total by the cost per ticket ($35) and rounding that up
        // because every ticket must be whole
        // finally outputting the total number of tickets to break even
        double numberOfTickets = Math.ceil(total / 35.0);
        System.out.println("In order to break even you must sell " + numberOfTickets);
        
        // close scanner
        input.close();
    }
}
