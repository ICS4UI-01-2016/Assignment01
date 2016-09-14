
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create the costs array
        int[] costs;

        //the array has 6 spaces
        costs = new int[6];

        //create scanner
        Scanner in = new Scanner(System.in);

        //ask user for inputs on price
        System.out.println("Please input the cost of food, DJ, hall rental, decorations, staff, and miscellaneous expenses");

        //input food cost
        costs[0] = in.nextInt();

        //input DJ cost
        costs[1] = in.nextInt();

        //input hall rental cost
        costs[2] = in.nextInt();

        //input decorations cost
        costs[3] = in.nextInt();

        //input staff cost
        costs[4] = in.nextInt();

        //input misc cost
        costs[5] = in.nextInt();

        //create totalCost int
        int totalCost = 0;

        //for loop for adding to total cost
        for (int i = 0; i <= 5; i++) {
            totalCost = totalCost + costs[i];
        }

        //calculate the number of tickets needed
        double numberTickets = Math.ceil(totalCost / 35);

        //output how many tickets are needed to sell
        System.out.println("In order to break even, " + numberTickets + " tickets must be sold.");
    }
}
