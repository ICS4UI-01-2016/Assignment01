
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in);
        // asks user input for a number between 1 and 10
        System.out.println("Enter a number between 1 and 10: ");
        // variable to store number 
        int num = input.nextInt();
        // loop through the number
        for (int i = 0; i < num; i++) {
            // output asterisks according to number
            System.out.print("*");
        }
        // output final answer
        System.out.println("");
    }
}
