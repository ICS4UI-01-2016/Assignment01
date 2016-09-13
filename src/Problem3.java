
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //add a scanner for input
        Scanner input = new Scanner(System.in);
        
        //asks user for the cost of food
        System.out.println("What is the cost of food?");
        //stores the inputed cost in an integer
        double foodCost = input.nextInt();
        
        //asks user for the cost of DJ
        System.out.println("What is the cost of the DJ?");
        //stores the inputed cost in an integer
        double djCost = input.nextInt();
        
        //asks user for the cost of hall rental
        System.out.println("What is the cost of the hall rental?");
        //stores the inputed cost in an integer
        double hrCost = input.nextInt();
        
        //asks user for the cost of decorations
        System.out.println("What is the cost of decorations?");
        //stores the inputed cost in an integer
        double decCost = input.nextInt();
        
        ////asks user for the cost of the wait staff
        System.out.println("What is the cost of the wait staff?");
        //stores the inputed cost in an integer
        double staffCost = input.nextInt();
        
        //asks user for the cost of misc items
        System.out.println("What is the cost of the miscellaneous expenses");
        //stores the inputed cost in an integer
        double misCost = input.nextInt();
        
        //add all the costs together and store final sum in an double called totalCost
        double totalCost = foodCost + djCost + hrCost + decCost + staffCost + misCost;
        
        //find the number of tickets needed to break even by dividing total cost by 35(cost of 1 ticket), save it in numTicket variable
        double numTicket = Math.ceil(totalCost/35);
        
        
        //print to screen the total cost of tickets and the number of tickets required to break even
        System.out.println("If the ticket cost is $35, the total cost will be " + totalCost +" with " + numTicket + " tickets needed to be sold to break even");
        
    }
}
