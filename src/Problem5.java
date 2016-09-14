
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a new Scanner to read in values
        Scanner input = new Scanner(System.in);



        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a Number between 1 and 10 to obtain that many astericks");

        // create an integer to store a number 
        int number = input.nextInt();

        if (number <= 10 && number >= 1) {

            // Output for Entering a Value 
            for (int i = 0; i < number; i++) {

                // Output for Entering a Value 
                for (int x = 0; x < number; x++) {

                    // Output our sentence to the user letting them know what they entered
                    System.out.print("*");
                }
                // Output our sentence to the user letting them know what they entered
                System.out.println("");
            }


        } else {

            // Output our sentence to the user letting them know what they entered
            System.out.println("Number not between 1 and 10. Try Again!");

        }
    }
}
