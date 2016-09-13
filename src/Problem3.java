
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //create variable for ticket cost
        int ticketCost = 35;
        //request food costs, store in variable
        System.out.println("What is the cost of Food?");
        int foodCost = input.nextInt();
        //request dj costs, store in variable
        System.out.println("What is the cost of the DJ?");
        int djCost = input.nextInt();
        //request hall rental costs, store in variable
        System.out.println("What is the cost of the Hall Rental?");
        int hallRentalCost = input.nextInt();
        //request decoration costs, store in variable
        System.out.println("What is the cost of the Decorations?");
        int decorationCost = input.nextInt();
        //request wait staff costs, store in variable
        System.out.println("What is the cost of the Wait Staff?");
        int waitStaffCost = input.nextInt();
        //request micelaneous costs, store in variable
        System.out.println("What are Miscelaneous costs?");
        int miscCost = input.nextInt();
        //add costs and store in variable
        double totalCost = foodCost + djCost + hallRentalCost
                + decorationCost + waitStaffCost + miscCost;
        //divide costs by 35
        double numTickets = totalCost / 35;
        //round up previous result to obtain number of tickets need to competely cover costs
        numTickets = Math.ceil(numTickets);
        //output total costs and number of tickets needed to user
        System.out.println("The total cost is " + totalCost + ", so " + numTickets + " ticket(s) will need to be sold to cover costs.");

    }
}
