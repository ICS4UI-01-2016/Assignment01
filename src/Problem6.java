
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a new Scanner to read in values
        Scanner input = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a number between 100 and 50 to stop at: ");

        // Create a variable to store a number
        int number = input.nextInt();

        // Create a variable at 100 to begin counting down
        int count = 100;

        // Output our sentence to the user letting them know what they entered
        System.out.println("100");

        // While loop to count down from 100
        while (count - 5 > number) {
            count = count - 5;

            // Output our sentence to the user letting them know what they entered
            System.out.println(count);
        }
    }
}