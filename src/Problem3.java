
import java.util.Scanner;

/**
 * Create a program that asks for the different expenses of a prom night and
 * and then total those expenses to determine and output how many $35 tickets you must sell
 * in order to break even.
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
        
        // ask the user for the different prom expenses and collect that data
        // through different variables
        System.out.println("What is the expense of the Food?");
        double foodCost = input.nextDouble();
        System.out.println("What is the expense of the DJ?");
        double djCost = input.nextDouble();
        System.out.println("What is the expense of the Hall Rentals?");
        double hallRentalsCost = input.nextDouble();
        System.out.println("What is the expense of the Decorations?");
        double decorationsCost = input.nextDouble();
        System.out.println("What is the expense of the Wait Staff?");
        double waitStaffCost = input.nextDouble();
        System.out.println("What are any Miscellaneous expenses?");
        double otherCost = input.nextDouble();
        
        // calculate and output the sum of the different expenses
        double totalCost = foodCost + djCost + hallRentalsCost + decorationsCost + waitStaffCost + otherCost;
        System.out.println("The total cost of prom is " + totalCost);
        
        // divide the total by the cost per ticket ($35) and rounding that up
        // because every ticket must be whole
        // finally outputting the total number of tickets to break even
        int numberOfTickets = (int) Math.ceil( totalCost / 35.0);
        System.out.println("In order to break even you must sell " + numberOfTickets + " ticket(s) at $35 each.");
        
        // close scanner
        input.close();
    }
}
