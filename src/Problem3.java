
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner in = new Scanner(System.in);
        //talk to user
        System.out.println("How much does the food cost?");
        //get number and save it
        double foodCost = in.nextInt();
        //talk to user
        System.out.println("How much does the DJ cost?");
        //get number and save it
        double djCost = in.nextInt();
        //talk to user
        System.out.println("How much does the hall rental cost?");
        //get number and save it
        double hallCost = in.nextInt();
        //talk to user
        System.out.println("How much does the decorations cost?");
        //get number and save it
        double decorationCost = in.nextInt();
        //talk to user
        System.out.println("How much does the wait staff cost?");
        //get number and save it
        double waitCost = in.nextInt();
        //talk to user
        System.out.println("How much is there in miscellaneous expenses");
        //get number and save it
        double miscCost = in.nextInt();
        //add all cost and save
        double cost = miscCost + waitCost + decorationCost + hallCost + djCost + foodCost;
        //tell user total cost
        System.out.println("This is the total cost");
        System.out.println(cost);
        //find number of tickets needed to cover cost and tell user
        System.out.println("This is how many tickets you would need to sell at $35 to cover the cost of the Prom.");
        System.out.println(cost/35);
    }
}
