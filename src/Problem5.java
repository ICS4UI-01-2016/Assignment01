
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to get user input
        Scanner input = new Scanner(System.in);

        //ask user for number
        System.out.println("Insert a number between 1 and 10");
        int number = input.nextInt();

        //for loop for number of asterisks to print
        for (int i = 0; i < number; i++) {
            //for loop for how many times to print it
            for (int e = 0; e < number; e++) {
                System.out.print("*");
            }
            //space out the end
            System.out.println("");
        }
    }
}
