
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //use array to store prices 
        double[] expenses = new double[6];

        //use array to store the different questions
        String[] question = {"the food", "the DJ", "the rental hall", "the decorations", "the wait staff", "the miscellaneous expenses"};

        //create for loop to ask and store answers to questions
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("How much does " + question[i] + " cost?");
            expenses[i] = input.nextDouble();
        }

        //add up expenses to find cost
        double cost = (expenses[0] + expenses[1] + expenses[2] + expenses[3] + expenses[4] + expenses[5]);
        System.out.println("The total cost will be " + cost);

        //find out how many tickets they need
        double tickets = Math.ceil(cost / 35);
        System.out.println("You will need to sell " + tickets + " tickets");
    }
}
