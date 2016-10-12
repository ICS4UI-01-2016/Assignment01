
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //making a new scanner that detects inputs by the user
        Scanner input = new Scanner(System.in);
        //creating an array to put the numbers into
        int[] costs = new int[6];
        //asks the user to enter the cost for food
        System.out.println("Enter the cost of food");
        //places the number into the first spot in the array
        costs[0] = input.nextInt();
        //asks the user to enter the cost for the DJ
        System.out.println("Enter the cost for the DJ");
        //places the number into the second spot in the array
        costs[1] = input.nextInt();
        //asks the user to enter the cost for the hall rental
        System.out.println("Enter the cost for the hall rental");
        //places the number into the third spot in the array
        costs[2] = input.nextInt();
        //asks the user to enter the cost of the decorations
        System.out.println("Enter the cost of the decorations");
        //places the number into the fourth spot in the array
        costs[3] = input.nextInt();
        //asks the user to enter the cost ofthe wait staff
        System.out.println("Enter the cost of the wait staff");
        //places the number into the fifth spot in the array
        costs[4] = input.nextInt();
        //asks the user to enter the cost of any miscellaneous expenses
        System.out.println("Enter the cost of any miscellaneous expenses");
        //places the number into the sixth spot in the array
        costs[5] = input.nextInt();
        
        int total = costs[0] + costs[1] + costs[2] + costs[3] + costs[4] + costs[5];
        int tickets = total/35;
        
        tickets = tickets + 1;
        System.out.println("The total cost of the party is " + total);
        System.out.println("The amount of tickets that need to be sold is " + tickets);
    }
}
