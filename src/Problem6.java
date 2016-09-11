
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
        // Ask the user to enter a number 
        System.out.print("Please enter a number between 50 and 100: ");
        // Make a new integer and set it to 100 to represent the max
        int max = 100;
        // Make an integer to store the user's input
        int num = input.nextInt();

        // Make a while loop to state if the max is greater than the enter number and the entered number is greater than 50 && Subtract the users input by 5
        while (max > num && num > 50) {
            // First print out 100
            System.out.println(max);
            // Subtract 5 from 100 until the countdown reaches the user's input
            max = max - 5;
        }

        // Inavlid input if the entered number is greater than 100 and id the number is less than 50
        if (num > 100 || num < 50) {
            System.out.println("Invalid input!");
        }
    }
}
