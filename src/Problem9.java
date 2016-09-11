
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add a new scanner
        Scanner input = new Scanner(System.in);
        // Create a string to store the words
        String[] words = new String[10];
        // Made a new double and set to 0 for counting the words
        double wordCount = 0;

        // Ask the user to type 10 words seperately
        System.out.println("Please enter 10 words seperately.");

        // For loop to add to the letter count
        for (int x = 0; x < words.length; x++) {
            words[x] = input.next();
            wordCount += words[x].length();
        }

        // Calculate the average letter amount using a double 
        double average = wordCount / words.length;

        // Print the average letter amount
        System.out.println("Therefore the letter average within these words is " + average + ".");

    }
}
