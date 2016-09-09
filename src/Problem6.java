
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user to input a number 
        System.out.println("Please insert a number between 50 and 100.");
        // Make a new integer for the user's input
        int max = 100;
        // Make an integer for the user's input
        int num = input.nextInt();

        // Subtract the users input by 5
        while (max > num) {
            max = max - 5;
            System.out.println(max);

            // If the user's input is greater than or less than 50, break the loop
            if (num > 101 && num < 49) {
                System.out.println("Invalid input.");
                break;
            }

            // Make the countdown stop before the users input
            if (num > max) {
                break;
            }
        }
    }
}
