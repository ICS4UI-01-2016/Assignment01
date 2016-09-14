
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a new Scanner to read in values
        Scanner input = new Scanner(System.in);
        
        // Create a array to store 10 words 
        String[] word = new String[10];

        // The intial Length of the characters 
        int length = 0;

        // Asking user to input 10 words to store in arrays
        for (int i = 0; i < word.length; i++) {
            System.out.println("Please enter a word");
            word[i] = input.nextLine();
            length = length + word[i].length();
        }
        // Formula to divide the total word Length
        length = length / 10;
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("Therefore, the average word length will be " + length + " words.");

    }
}
