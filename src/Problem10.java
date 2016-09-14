
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a new Scanner to read in values
        Scanner input = new Scanner(System.in);

        // Create variable used keep count of the words inputed
        int count = 0;

        // Infinite Loop 
        while (true) {

            // Output our sentence to the user letting them know what they entered
            System.out.println("Enter a word on each line until you 'exit'");
            String word = input.nextLine();

            // If user enters exit then prevents them from inputing any more words 
            if (word.equals("exit")) {

                // Output our sentence to the user letting them know what they entered
                System.out.println("You have entered " + count + " words");
                break;
            }
            // Counts the amount of words inputed on each line
            count++;

        }


    }
}
