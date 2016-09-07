
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input the scanner
        Scanner input = new Scanner(System.in);
        
        // ask for the costs
        System.out.println("Enter the cost of the food: ");
        double food = input.nextDouble();
        
        System.out.println("Please enter the cost of the DJ: ");
        double dj = input.nextDouble();
        
        System.out.println("Please enter the cost of the hall rental: ");
        double hall = input.nextDouble();
        
        System.out.println("Please enter the cost of the decorations: ");
        double decor = input.nextDouble();
        
        System.out.println("Please enter the cost of the wait staff: ");
        double staff = input.nextDouble();
        
        System.out.println("Please enter the cost of any miscellaneous expenses: ");
        double extra = input.nextDouble();
        
        // add all the expenses
        double total = food + dj + hall + decor + staff + extra;
        
        // calculate how many tickets are required
        double tickets = total / 35;
        tickets = Math.ceil(tickets);
        
        // tell the user 
        System.out.println("The prom will cost " + total + ".");
        System.out.println("You will need to sell " + tickets + " tickets to break even.");
    }
}
