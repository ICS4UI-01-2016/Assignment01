
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joudn2217
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        // create a scanner in input data from user
        System.out.println("Please enter a number between 1 and 10:");
        //prompt user for a number

        while (true) {
            //create a while loop so if the user enters an inncorrect value it can continue asking for a valid one
            int number = in.nextInt();
            //store number inputted by user
            if (number >= 1 && number <= 10) {
                //if loop to sort through valid and non valid inputs
                for (int x = 0; x < number; x++){
                for (int i = 0; i < number; i++) {
                    System.out.print("*");
                }
                    System.out.println("");
                }
                //if between 1 and 10 out the astricts in box formation
                break;
            } else {
                System.out.println("Please enter a valid number:");
                //continue asking for input
            }
        }
    }
}
