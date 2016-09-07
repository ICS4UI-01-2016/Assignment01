
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
        int foodCost = input.nextInt();
        
        //asks user for the cost of DJ
        System.out.println("What is the cost of the DJ?");
        //stores the inputed cost in an integer
        int djCost = input.nextInt();
        
        //asks user for the cost of hall rental
        System.out.println("What is the cost of the hall rental?");
        //stores the inputed cost in an integer
        int hrCost = input.nextInt();
        
        //asks user for the cost of decorations
        System.out.println("What is the cost of decorations?");
        //stores the inputed cost in an integer
        int decCost = input.nextInt();
        
        ////asks user for the cost of the wait staff
        System.out.println("What is the cost of the wait staff?");
        //stores the inputed cost in an integer
        int staffCost = input.nextInt();
        
        //asks user for the cost of misc items
        System.out.println("What is the cost of the miscellaneous expenses");
        //stores the inputed cost in an integer
        int misCost = input.nextInt();
        
        //add all the costs together and store final sum in an int called totalCost
        int totalCost = foodCost + djCost + hrCost + decCost + staffCost + misCost;
        
        double numTicket = Math.ceil(totalCost/35);
        System.out.println("The total cost will be " + totalCost +" with " + numTicket + " tickets needed to be sold to break even");
    }
}
