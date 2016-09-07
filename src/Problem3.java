
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
           
        double total = food + dj + hallRentals + decorations + waitStaff + other;
        System.out.println("The total cost of prom is " + total);
        
        double numberOfTickets = Math.ceil(total / 35);
        System.out.println("In order to break even you must sell " + numberOfTickets);
        
        
    }
}
