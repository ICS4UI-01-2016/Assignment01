
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cost;
        //store 6 costs in array 
        cost = new int[6];
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user for food cost 
        System.out.println("please enter the cost of food");
        //allow user to enter cost 
        cost[0] = input.nextInt();
        //as user to enter cost of dj
        System.out.println("please enter the cost of the dj");
        //allow user to enter cost
        cost[1] = input.nextInt();
        //ask user for hall rental cost 
        System.out.println("please enter the cost of the hall rental");
        //allow user to enter cost 
        cost[2] = input.nextInt();
        //ask user for decoration cost 
        System.out.println("please enter the cost of the decorations");
        //allow user to enter cost 
        cost[3] = input.nextInt();
        //ask user for wait staff cost 
        System.out.println("Please enter the cost of the wait staff");
        //allow user to enter cost 
        cost[4] = input.nextInt();
        //ask user to enter all other miscellaneous costs
        System.out.println("Please enter the cost of any other miscellaneous expenses. ");
        //allow user to enter cost 
        cost[5] = input.nextInt();
        int total = 0;

        //using a for loop calculate the sum of all the costs 
        for (int i = 0; i <= 5; i++) {
            total = total + cost[i];
        }
        //round up the amount of tickets sold
        double breakeven = Math.ceil(total / 35f);
        //tell user the total cost of the prom 
        System.out.println(" The total cost of prom is " + "$" + total);
        //tell user how many tickets they must sell to break even
        System.out.println(" to break even you must sell " + breakeven + " tickets ");

    }
}
