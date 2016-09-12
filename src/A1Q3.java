
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);
        
        // create an array to store costs
        int[] costs = new int [6];
        
        // tell user to enter costs:
        
        // ask user for food cost - store in the array
        System.out.println("Enter cost of food");
        costs[0] = input.nextInt();
        
        // ask user for Dj cost - store in the array
        System.out.println("Enter cost of Dj");
        costs[1] = input.nextInt();
        
        // ask user for hall cost - store in the array
        System.out.println("Enter cost of hall rental");
        costs[2] = input.nextInt();
        
        // ask user for decorations cost - store in the array
        System.out.println("Enter cost of decorations");
        costs[3] = input.nextInt();
        
        // ask user wait staff - store in the array
        System.out.println("Enter cost of the wait staff");
        costs[4] = input.nextInt();
        
        // ask user miscellaneous expenses - store in the array
        System.out.println("Enter cost of miscellaneous expenses");
        costs[5] = input.nextInt();
        
        // add all numbers in array
        int total = costs[0] + costs[1] + costs[2] + costs[3] + costs[4] + costs[5];
        // tell user the total
        System.out.println("The total cost of the prom is $" + total);
        // determine the tickets need to break even
        double tickets = total/35;
        // tell user the amount of tickets needed
        System.out.println("The amount of tickets needed is " + tickets);
        
        // close the scanner
        input.close();
        
        
        
        
        
     
    }
}
