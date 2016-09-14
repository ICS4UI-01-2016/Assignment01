
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to get user input
        Scanner input = new Scanner(System.in); 
        // create an array with a size of 10
        int[] length = new int[10];
        // loop through the array
        for(int i = 0; i < 10; i++){
            // asks user input for a word
            System.out.println("Enter a word");
            // variable to store the word
            String word = input.nextLine();
            // storing the word length
            length[i] = word.length();
        }
        // calculating average of all of the word lengths
        double avg = (length[0] + length[1] + length[2] + length[3] + length[4] + length[5] + length[6] + length[7] + length[8] + length[9])/10;
        // outputs average to screen
        System.out.println("The average word length is " + avg);
    }
}
